package oliv.form.e4.xtext;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

import oliv.form.xtext.dsl.Variable;


public class Vue implements ConstantesUI{

	private TableViewer viewer;
	private List<Variable> tableau;

	@PostConstruct
	public void postConstruct(Composite parent,IEclipseContext context) {
		
		this.viewer = new TableViewer(parent,
				SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		
		final Table table = viewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true,GridData.CENTER,GridData.CENTER));
		
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		TableViewerColumn col = new TableViewerColumn(viewer, SWT.NONE);
		col.getColumn().setWidth(100);
		col.getColumn().setText("Nom");
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Variable p = (Variable) element;
				return p.getNom();
			}
		});
		col = new TableViewerColumn(viewer, SWT.NONE);
		col.getColumn().setWidth(100);
		col.getColumn().setText("Valeur");
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Variable p = (Variable) element;
				return ""+p.getValeur();
			}
		});
	
		cree();
	}


	@Inject
	public void enregistre(@Optional @Named(VARIABLES) List<Variable> tableau) {
		if (tableau != null) {
			this.tableau = tableau;
			cree();
			
		}
	}

	private void cree() {
		if (viewer == null||tableau==null) {
			return;
		}
		viewer.setInput(tableau);
		viewer.refresh();
	}
}

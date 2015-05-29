package io.github.nickvolynkin.sigma.ui;


import io.github.nickvolynkin.sigma.core.LaunchConfigurationSerializer;
import io.github.nickvolynkin.sigma.core.LaunchConfigurationSetup;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.DebugUIPlugin;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.swt.SWT;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

public class SigmaLaunchConfigurationTab extends AbstractLaunchConfigurationTab {

	private static final String CONFIGURATION_SETUP_TAB_NAME = "Configuration setup";

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		List<LaunchConfigurationSetup> launchConfigurationSetups = LaunchConfigurationSerializer.deserialize(configuration);

	}

	@Override
	public void createControl(Composite parent) {


//		GridData gridData = new GridData(SWT.FILL,SWT.FILL, true, true);
		//tree with settings on the left side
		//label with manual on the right side
		Composite mainControl = SWTFactory.createComposite(parent, 2, 1, GridData.FILL_BOTH);
		setControl(mainControl); 
		
		SWTFactory.createLabel(mainControl, "test", 1);

		/** These filters will pick ELCs for adding to a CLC. Requirements are:
		 * <ul>
		 *		<li>Not a CLC itself</li>
		 *		<li>Valid</li>
		 *		<li>Not empty</li>
		 *</ul>*/
		List<ViewerFilter> elcFilters = new LinkedList<ViewerFilter>();
		
		DebugUIPlugin default1 = DebugUIPlugin.getDefault();
		
		if (default1 == null) {
			
		}
		
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return CONFIGURATION_SETUP_TAB_NAME;
	}
}

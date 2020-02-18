package modules

import geb.Module

class AbodeqaTabs extends Module{
	
	static content = {
		aboutUs(wait: true){	$("#mainnav-menu > li.page_item.page-item-2 > a") }
	}
	
	def "Click on Abodeqa-->  AboutUs tab"(){
		aboutUs.click()
	}

}

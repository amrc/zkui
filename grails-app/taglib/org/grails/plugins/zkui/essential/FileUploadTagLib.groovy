package org.grails.plugins.zkui.essential

import org.grails.plugins.zkui.AbstractTagLib

class FileUploadTagLib extends AbstractTagLib {
    static namespace = "z"

    def fileupload = {attrs, b ->
        doTag(attrs, b, servletContext, request, response, pageScope, out)
    }

    @Override
    Class getComponentClass() {
        return org.zkoss.zul.Fileupload
    }

}
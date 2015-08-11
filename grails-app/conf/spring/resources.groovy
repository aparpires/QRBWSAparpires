import grails.rest.render.json.JsonRenderer
import grails.rest.render.xml.XmlRenderer
import qrbws.Author

beans = {
    corsFilter(CorsFilterA)
    cityXmlRenderer(XmlRenderer, Author) {
        excludes = ['class']
    }
    cityJSONRenderer(JsonRenderer, Author) {
        excludes = ['class']
    }
}

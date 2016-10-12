package demo

class DemoController {
    HelperService helperService

    def index() {
        helperService.doSomething()
        render 'Success'
    }
}

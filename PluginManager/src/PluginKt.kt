interface PluginKt
{
    fun _init(self: PluginRuntime){}
    fun _refresh(self: PluginRuntime) {}
    fun _update(self: PluginRuntime){}
    fun _stop(self: PluginRuntime){}
}
package com.oney.gcm;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.location.LocationModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.uimanager.ViewManager;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Package defining basic modules and view managers.
 */
public class MainReactPackage implements ReactPackage {

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Arrays.<NativeModule>asList(
                new AsyncStorageModule(reactContext),
//                new ClipboardModule(reactContext),
                new FrescoModule(reactContext),
                new IntentModule(reactContext),
                new LocationModule(reactContext),
                new NetworkingModule(reactContext),
//                new NetInfoModule(reactContext),
                new WebSocketModule(reactContext));
//                new ToastModule(reactContext));
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}

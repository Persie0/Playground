package p266n;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import p000a.InterfaceC0001b;

/* JADX INFO: renamed from: n.c */
/* JADX INFO: loaded from: classes.dex */
public class C7666c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0001b f42137a;

    /* JADX INFO: renamed from: b */
    public final ComponentName f42138b;

    public C7666c(InterfaceC0001b interfaceC0001b, ComponentName componentName) {
        this.f42137a = interfaceC0001b;
        this.f42138b = componentName;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m15263a(Context context, String str, AbstractServiceConnectionC7668e abstractServiceConnectionC7668e) {
        abstractServiceConnectionC7668e.f42145a = context.getApplicationContext();
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC7668e, 33);
    }
}

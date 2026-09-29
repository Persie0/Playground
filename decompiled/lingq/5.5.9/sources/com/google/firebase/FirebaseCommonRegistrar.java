package com.google.firebase;

import ae.C0065e;
import af.InterfaceC0070c;
import af.InterfaceC0071d;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.C3218a;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import ee.InterfaceC5398a;
import ge.C5789m;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p118fe.C5509a;
import p118fe.C5511c;
import p118fe.C5521m;
import p118fe.C5527s;
import p150h9.C5931p;
import p200jf.AbstractC6472d;
import p200jf.C6474f;
import p200jf.InterfaceC6475g;
import p291o7.C8002l;
import p402u0.C9362e;
import sl.C9069b;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: renamed from: a */
    public static String m9146a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<C5511c<?>> getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        C5511c.a aVarM11743a = C5511c.m11743a(InterfaceC6475g.class);
        int i10 = 2;
        aVarM11743a.m11745a(new C5521m(2, 0, AbstractC6472d.class));
        aVarM11743a.f34162f = new C5789m(i10);
        arrayList.add(aVarM11743a.m11746b());
        C5527s c5527s = new C5527s(InterfaceC5398a.class, Executor.class);
        C5511c.a aVar = new C5511c.a(C3218a.class, new Class[]{InterfaceC0071d.class, HeartBeatInfo.class});
        aVar.m11745a(C5521m.m11761a(Context.class));
        aVar.m11745a(C5521m.m11761a(C0065e.class));
        aVar.m11745a(new C5521m(2, 0, InterfaceC0070c.class));
        aVar.m11745a(new C5521m(1, 1, InterfaceC6475g.class));
        aVar.m11745a(new C5521m((C5527s<?>) c5527s, 1, 0));
        aVar.f34162f = new C5509a(i10, c5527s);
        arrayList.add(aVar.m11746b());
        arrayList.add(C6474f.m13081a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C6474f.m13081a("fire-core", "20.3.2"));
        arrayList.add(C6474f.m13081a("device-name", m9146a(Build.PRODUCT)));
        arrayList.add(C6474f.m13081a("device-model", m9146a(Build.DEVICE)));
        arrayList.add(C6474f.m13081a("device-brand", m9146a(Build.BRAND)));
        int i11 = 20;
        arrayList.add(C6474f.m13082b("android-target-sdk", new C8002l(i11)));
        arrayList.add(C6474f.m13082b("android-min-sdk", new C5789m(i11)));
        arrayList.add(C6474f.m13082b("android-platform", new C9362e(24)));
        arrayList.add(C6474f.m13082b("android-installer", new C5931p(19)));
        try {
            string = C9069b.f47354e.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(C6474f.m13081a("kotlin", string));
        }
        return arrayList;
    }
}

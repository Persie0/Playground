package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p000.AbstractC3122is;
import p000.C3386nv;
import p000.gc1;
import p000.h70;
import p000.hc1;
import p000.ho2;
import p000.l62;
import p000.lb2;
import p000.n62;
import p000.n92;
import p000.q43;
import p000.rp7;
import p000.tr3;
import p000.u40;
import p000.ur3;
import p000.vk4;
import p000.vr3;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: renamed from: a */
    public static String m6667a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        gc1 gc1VarM13189b = hc1.m13189b(n92.class);
        gc1VarM13189b.m12471a(new lb2(2, 0, u40.class));
        gc1VarM13189b.f40520f = new C3386nv(27);
        arrayList.add(gc1VarM13189b.m12472b());
        rp7 rp7Var = new rp7(h70.class, Executor.class);
        gc1 gc1Var = new gc1(n62.class, new Class[]{ur3.class, vr3.class});
        gc1Var.m12471a(lb2.m16059c(Context.class));
        gc1Var.m12471a(lb2.m16059c(q43.class));
        gc1Var.m12471a(new lb2(2, 0, tr3.class));
        gc1Var.m12471a(new lb2(1, 1, n92.class));
        gc1Var.m12471a(new lb2(rp7Var, 1, 0));
        gc1Var.f40520f = new l62(rp7Var, 0);
        arrayList.add(gc1Var.m12472b());
        arrayList.add(AbstractC3122is.m14099m("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC3122is.m14099m("fire-core", "22.0.1"));
        arrayList.add(AbstractC3122is.m14099m("device-name", m6667a(Build.PRODUCT)));
        arrayList.add(AbstractC3122is.m14099m("device-model", m6667a(Build.DEVICE)));
        arrayList.add(AbstractC3122is.m14099m("device-brand", m6667a(Build.BRAND)));
        arrayList.add(AbstractC3122is.m14102p("android-target-sdk", new ho2(18)));
        arrayList.add(AbstractC3122is.m14102p("android-min-sdk", new ho2(19)));
        arrayList.add(AbstractC3122is.m14102p("android-platform", new ho2(20)));
        arrayList.add(AbstractC3122is.m14102p("android-installer", new ho2(21)));
        try {
            vk4.f65533b.getClass();
            str = "2.3.21";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(AbstractC3122is.m14099m("kotlin", str));
        }
        return arrayList;
    }
}

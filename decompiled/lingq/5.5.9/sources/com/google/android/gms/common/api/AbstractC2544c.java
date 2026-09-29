package com.google.android.gms.common.api;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p152hb.C6000p1;
import p152hb.InterfaceC5957c;
import p152hb.InterfaceC5980j;
import p152hb.InterfaceC5983k;

/* JADX INFO: renamed from: com.google.android.gms.common.api.c */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractC2544c {

    /* JADX INFO: renamed from: a */
    public static final Set<AbstractC2544c> f13900a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: com.google.android.gms.common.api.c$a */
    @Deprecated
    public interface a extends InterfaceC5957c {
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.c$b */
    @Deprecated
    public interface b extends InterfaceC5980j {
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo7555a();

    /* JADX INFO: renamed from: d */
    public abstract void mo7556d();

    /* JADX INFO: renamed from: e */
    public abstract void mo7557e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* JADX INFO: renamed from: f */
    public boolean mo7558f(InterfaceC5983k interfaceC5983k) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: g */
    public void mo7559g() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo7560h(C6000p1 c6000p1);
}

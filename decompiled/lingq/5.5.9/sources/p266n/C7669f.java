package p266n;

import android.content.ComponentName;
import cn.C2064a;
import cn.InterfaceC2068e;
import co.InterfaceC2076h;
import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C6859a;
import p000a.InterfaceC0001b;
import p372rm.InterfaceC8863u;
import sl.InterfaceC9070c;

/* JADX INFO: renamed from: n.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7669f {

    /* JADX INFO: renamed from: a */
    public final Object f42146a;

    /* JADX INFO: renamed from: b */
    public final Object f42147b;

    /* JADX INFO: renamed from: c */
    public final Object f42148c;

    /* JADX INFO: renamed from: d */
    public final Object f42149d;

    /* JADX INFO: renamed from: e */
    public final Object f42150e;

    public C7669f(InterfaceC0001b interfaceC0001b, BinderC7665b binderC7665b, ComponentName componentName) {
        this.f42146a = new Object();
        this.f42147b = interfaceC0001b;
        this.f42148c = binderC7665b;
        this.f42149d = componentName;
        this.f42150e = null;
    }

    public C7669f(C2064a c2064a, InterfaceC2068e interfaceC2068e, InterfaceC9070c interfaceC9070c) {
        C5207g.m11111f(c2064a, "components");
        C5207g.m11111f(interfaceC2068e, "typeParameterResolver");
        C5207g.m11111f(interfaceC9070c, "delegateForDefaultTypeQualifiers");
        this.f42146a = c2064a;
        this.f42147b = interfaceC2068e;
        this.f42148c = interfaceC9070c;
        this.f42149d = interfaceC9070c;
        this.f42150e = new C6859a(this, interfaceC2068e);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC8863u m15267a() {
        return ((C2064a) this.f42146a).f10509o;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2076h m15268b() {
        return ((C2064a) this.f42146a).f10495a;
    }
}

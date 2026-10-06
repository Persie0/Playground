package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbu extends jxc {

    /* JADX INFO: renamed from: a */
    public final boolean f24139a;

    /* JADX INFO: renamed from: b */
    public final boolean f24140b;

    /* JADX INFO: renamed from: c */
    private final ebv f24141c;

    /* JADX INFO: renamed from: d */
    private final boolean f24142d;

    /* JADX INFO: renamed from: e */
    private final int f24143e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbu(jwn jwnVar, jwn jwnVar2, ebv ebvVar, dhv dhvVar) {
        super(jwr.m13632b(jwnVar, jwnVar2));
        boolean z = false;
        this.f24141c = ebvVar;
        this.f24139a = ebvVar.f13300b != ebvVar.f13301c;
        if (dhvVar.mo6184l(dht.f11176d) || dhvVar.mo6184l(dht.f11186n)) {
            z = true;
        }
        this.f24140b = z;
        this.f24143e = ebvVar.f13300b;
        this.f24142d = dhvVar.mo6184l(dht.f11177e);
    }

    @Override // p000.jxc
    /* JADX INFO: renamed from: d */
    protected final /* bridge */ /* synthetic */ Object mo3833d(Object obj) {
        List list = (List) obj;
        Float f = (Float) list.get(0);
        egl eglVar = (egl) list.get(1);
        int i = this.f24143e;
        if (this.f24139a && f.floatValue() > 1.0f) {
            i = this.f24141c.f13301c;
        }
        if (this.f24140b && eglVar != egl.NONE) {
            float f2 = 0.5f;
            if (this.f24142d && eglVar.equals(egl.DEBLUR)) {
                f2 = 0.75f;
            }
            i = (int) (i * f2);
        }
        return Integer.valueOf(i);
    }
}

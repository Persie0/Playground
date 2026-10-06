package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class geu extends jxd {

    /* JADX INFO: renamed from: a */
    private final mwx f24434a;

    /* JADX INFO: renamed from: b */
    private final mwx f24435b;

    /* JADX INFO: renamed from: c */
    private final Object f24436c;

    public geu(jww jwwVar, Object obj, mwh mwhVar) {
        super(jwwVar);
        lku.m15669w(mwhVar.containsKey(obj));
        this.f24436c = obj;
        this.f24434a = mwhVar;
        this.f24435b = ((mzq) mwhVar).f41853c;
    }

    @Override // p000.jxd
    /* JADX INFO: renamed from: b */
    public final Object mo3609b(Object obj) {
        mwx mwxVar = this.f24434a;
        Object orDefault = mwxVar.getOrDefault(obj, mwxVar.get(this.f24436c));
        orDefault.getClass();
        return orDefault;
    }

    @Override // p000.jxd
    /* JADX INFO: renamed from: c */
    protected final Object mo3610c(Object obj) {
        Object orDefault = this.f24435b.getOrDefault(obj, this.f24436c);
        orDefault.getClass();
        return orDefault;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public geu(jww jwwVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this(jwwVar, obj, new mzq(new Object[]{obj2, obj3, obj4, obj5}, 2));
        lku.m15653g(obj2, obj3);
        lku.m15653g(obj4, obj5);
    }

    public geu(jww jwwVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this(jwwVar, obj, mwh.m17062b(obj2, obj3, obj4, obj5, obj6, obj7));
    }

    public geu(jww jwwVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        this(jwwVar, obj, mwh.m17063c(obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9));
    }
}

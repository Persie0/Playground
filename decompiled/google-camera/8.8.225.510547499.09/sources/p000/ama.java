package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ama implements alt {

    /* JADX INFO: renamed from: a */
    private final bck[] f680a;

    public ama(bck[] bckVarArr, byte[] bArr, byte... bArr2) {
        bckVarArr.getClass();
        this.f680a = bckVarArr;
    }

    @Override // p000.alt
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ alr mo916a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, oni] */
    @Override // p000.alt
    /* JADX INFO: renamed from: b */
    public final alr mo917b(Class cls, alz alzVar) {
        Object objMo1803a = null;
        for (bck bckVar : this.f680a) {
            if (ooc.m18737c(bckVar.f2948a, cls)) {
                objMo1803a = bckVar.f2949b.mo1803a(alzVar);
            }
        }
        if (objMo1803a != null) {
            return (alr) objMo1803a;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(String.valueOf(cls.getName())));
    }
}

package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class mzc extends nab {
    /* JADX INFO: renamed from: a */
    public abstract myy mo16917a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        mo16917a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof myx) {
            myx myxVar = (myx) obj;
            if (myxVar.mo17161a() > 0 && mo16917a().mo16911co(myxVar.mo17162b()) == myxVar.mo17161a()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof myx)) {
            return false;
        }
        myx myxVar = (myx) obj;
        Object objMo17162b = myxVar.mo17162b();
        int iMo17161a = myxVar.mo17161a();
        if (iMo17161a != 0) {
            return mo16917a().mo16923i(objMo17162b, iMo17161a);
        }
        return false;
    }
}

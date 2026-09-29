package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class qrc extends sqc {
    @Override // p000.sqc
    /* JADX INFO: renamed from: a */
    public final void mo9866a(Object obj, long j, Object obj2) {
        mpc mpcVarMo5748a = (mpc) f0d.m11445l(obj, j);
        mpc mpcVar = (mpc) f0d.m11445l(obj2, j);
        int size = mpcVarMo5748a.size();
        int size2 = mpcVar.size();
        if (size > 0 && size2 > 0) {
            if (!mpcVarMo5748a.zza()) {
                mpcVarMo5748a = mpcVarMo5748a.mo5748a(size2 + size);
            }
            mpcVarMo5748a.addAll(mpcVar);
        }
        if (size > 0) {
            mpcVar = mpcVarMo5748a;
        }
        f0d.m11437d(obj, j, mpcVar);
    }

    @Override // p000.sqc
    /* JADX INFO: renamed from: b */
    public final void mo9867b(Object obj, long j) {
        ((mpc) f0d.m11445l(obj, j)).zzb();
    }
}

package p152hb;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C2542a;
import p041c5.C1702c;
import p136gc.C5752h;

/* JADX INFO: renamed from: hb.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5989m<A, ResultT> {

    /* JADX INFO: renamed from: a */
    public final Feature[] f35527a;

    /* JADX INFO: renamed from: b */
    public final boolean f35528b;

    /* JADX INFO: renamed from: hb.m$a */
    public static class a<A, ResultT> {

        /* JADX INFO: renamed from: a */
        public C1702c f35529a;
    }

    public AbstractC5989m(Feature[] featureArr, boolean z10) {
        this.f35527a = featureArr;
        this.f35528b = featureArr != null && z10;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo12422a(C2542a.e eVar, C5752h c5752h) throws RemoteException;
}

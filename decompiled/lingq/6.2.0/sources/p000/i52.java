package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C0713b;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i52 implements sg5, kk1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f43533a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f43534b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f43535c;

    public /* synthetic */ i52(C3496qf c3496qf, int i, long j, long j2) {
        this.f43535c = c3496qf;
        this.f43534b = i;
        this.f43533a = j;
    }

    @Override // p000.kk1
    public void accept(Object obj) {
        dn9 dn9Var = (dn9) this.f43535c;
        gs1 gs1Var = (gs1) obj;
        k47 k47Var = dn9Var.f35904c;
        dn9Var.f35909h.getClass();
        ImmutableList immutableList = gs1Var.f41257a;
        long j = gs1Var.f41259c;
        tj0 tj0Var = new tj0(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(immutableList.size());
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) tj0Var.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        k47Var.getClass();
        k47Var.m14816K(bArrMarshall.length, bArrMarshall);
        dn9Var.f35902a.mo2535e(bArrMarshall.length, k47Var);
        long j2 = gs1Var.f41258b;
        C0713b c0713b = dn9Var.f35909h;
        long j3 = this.f43533a;
        if (j2 == -9223372036854775807L) {
            bna.m3987z(c0713b.f6411t == Long.MAX_VALUE);
        } else {
            long j4 = c0713b.f6411t;
            j3 = j4 == Long.MAX_VALUE ? j3 + j2 : j2 + j4;
        }
        dn9Var.f35902a.mo2531a(j3, this.f43534b | 1, bArrMarshall.length, 0, null);
    }

    @Override // p000.sg5
    public void invoke(Object obj) {
        ((InterfaceC3534rf) obj).mo20629n((C3496qf) this.f43535c, this.f43534b, this.f43533a);
    }

    public /* synthetic */ i52(dn9 dn9Var, long j, int i) {
        this.f43535c = dn9Var;
        this.f43533a = j;
        this.f43534b = i;
    }
}

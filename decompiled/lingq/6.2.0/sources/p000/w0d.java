package p000;

import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzoh;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class w0d extends wpb implements cac {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReference f66193f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0d(v4d v4dVar, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f66193f = atomicReference;
    }

    @Override // p000.wpb
    /* JADX INFO: renamed from: F */
    public final boolean mo3072F(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzoh.CREATOR);
        bqb.m4109f(parcel);
        mo4481y(arrayListCreateTypedArrayList);
        return true;
    }

    @Override // p000.cac
    /* JADX INFO: renamed from: y */
    public final void mo4481y(List list) {
        AtomicReference atomicReference = this.f66193f;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}

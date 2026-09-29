package com.google.android.gms.internal.measurement;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2728k5 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14291a;

    /* JADX INFO: renamed from: a */
    public abstract byte mo7919a();

    @Override // java.util.Iterator, java.util.ListIterator
    public /* synthetic */ Object next() {
        return Byte.valueOf(mo7919a());
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14291a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}

package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2835s5 extends AbstractC2728k5 {

    /* JADX INFO: renamed from: b */
    public int f14423b;

    /* JADX INFO: renamed from: c */
    public final int f14424c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzka f14425d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2835s5(zzka zzkaVar) {
        super(1);
        this.f14425d = zzkaVar;
        this.f14423b = 0;
        this.f14424c = zzkaVar.mo8492q();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2728k5
    /* JADX INFO: renamed from: a */
    public final byte mo7919a() {
        int i10 = this.f14423b;
        if (i10 >= this.f14424c) {
            throw new NoSuchElementException();
        }
        this.f14423b = i10 + 1;
        return this.f14425d.mo8491l(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14423b < this.f14424c;
    }
}

package com.google.android.gms.internal.measurement;

import ae.C0062b;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2902x7 extends C2647e8 {
    public C2902x7(int i10) {
        super(i10);
    }

    @Override // com.google.android.gms.internal.measurement.C2647e8
    /* JADX INFO: renamed from: a */
    public final void mo7773a() {
        if (!this.f14177d) {
            for (int i10 = 0; i10 < m7774b(); i10++) {
                Map.Entry entry = (Map.Entry) this.f14175b.get(i10);
                if (((InterfaceC2645e6) entry.getKey()).m7772d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : this.f14176c.isEmpty() ? C0062b.f160g : this.f14176c.entrySet()) {
                if (((InterfaceC2645e6) entry2.getKey()).m7772d()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.mo7773a();
    }
}

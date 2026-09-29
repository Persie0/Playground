package androidx.fragment.app;

import android.os.Bundle;
import androidx.p544savedstate.C1189a;
import androidx.view.C1024c0;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: renamed from: androidx.fragment.app.d0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0947d0 implements C1189a.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6277a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6278b;

    public /* synthetic */ C0947d0(int i10, Object obj) {
        this.f6277a = i10;
        this.f6278b = obj;
    }

    @Override // androidx.p544savedstate.C1189a.b
    /* JADX INFO: renamed from: a */
    public final Bundle mo811a() {
        int i10 = this.f6277a;
        Object obj = this.f6278b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return ((FragmentManager) obj).m3636a0();
            default:
                return C1024c0.m3928a((C1024c0) obj);
        }
    }
}

package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.view.AbstractC1036h0;
import androidx.view.C1042k0;
import mk.C7581d;
import p260m8.C7499b;

/* JADX INFO: renamed from: dagger.hilt.android.internal.managers.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5115b implements C1042k0.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f33090a;

    public C5115b(ComponentActivity componentActivity) {
        this.f33090a = componentActivity;
    }

    @Override // androidx.view.C1042k0.b
    /* JADX INFO: renamed from: b */
    public final <T extends AbstractC1036h0> T mo3730b(Class<T> cls) {
        return new C5116c.b(new C7581d(((C5116c.a) C7499b.m14976z(this.f33090a, C5116c.a.class)).mo10895d().f41843a));
    }
}

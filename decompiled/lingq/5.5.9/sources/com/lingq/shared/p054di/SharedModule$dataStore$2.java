package com.lingq.shared.p054di;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p212k3.AbstractC6579a;
import p385sf.C9000b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public /* synthetic */ class SharedModule$dataStore$2 extends FunctionReferenceImpl implements InterfaceC2052l<Context, List<? extends SharedPreferencesMigration<AbstractC6579a>>> {
    public SharedModule$dataStore$2(SharedModule sharedModule) {
        super(sharedModule);
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final List<? extends SharedPreferencesMigration<AbstractC6579a>> mo528n(Context context) {
        Context context2 = context;
        C5207g.m11111f(context2, "p0");
        ((SharedModule) this.f38112b).getClass();
        LinkedHashSet linkedHashSet = SharedPreferencesMigrationKt.f5772a;
        C5207g.m11111f(linkedHashSet, "keysToMigrate");
        return C9000b.m17251q(new SharedPreferencesMigration(context2, SharedPreferencesMigrationKt.m3042b(linkedHashSet), SharedPreferencesMigrationKt.m3041a()));
    }
}

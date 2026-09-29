package androidx.datastore.migrations;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 5, 1}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.datastore.migrations.SharedPreferencesMigration", m19206f = "SharedPreferencesMigration.kt", m19207l = {147}, m19208m = "shouldMigrate")
public final class SharedPreferencesMigration$shouldMigrate$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public SharedPreferencesMigration f5766d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f5767e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SharedPreferencesMigration<T> f5768f;

    /* JADX INFO: renamed from: g */
    public int f5769g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration$shouldMigrate$1(SharedPreferencesMigration<T> sharedPreferencesMigration, InterfaceC9968c<? super SharedPreferencesMigration$shouldMigrate$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f5768f = sharedPreferencesMigration;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 for r4v1 'this'  wl.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r5) {
        /*
            r4 = this;
            r4.f5767e = r5
            int r5 = r4.f5769g
            r2 = 7
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 3
            r5 = r5 | r0
            r2 = 6
            r4.f5769g = r5
            androidx.datastore.migrations.SharedPreferencesMigration<T> r5 = r4.f5768f
            r1 = 0
            r0 = r1
            java.lang.Object r5 = r5.mo3018a(r0, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}

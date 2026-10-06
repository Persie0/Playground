package p000;

import android.support.p001v8.renderscript.ScriptIntrinsicBLAS;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", m18657c = "CoroutinesRoom.kt", m18658d = "invokeSuspend", m18659e = {129, ScriptIntrinsicBLAS.NON_UNIT})
final class apg extends oml implements onm {

    /* JADX INFO: renamed from: a */
    Object f1990a;

    /* JADX INFO: renamed from: b */
    int f1991b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ apt f1992c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ otq f1993d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ Callable f1994e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ otq f1995f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ app f1996g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apg(apt aptVar, app appVar, otq otqVar, Callable callable, otq otqVar2, ols olsVar) {
        super(2, olsVar);
        this.f1992c = aptVar;
        this.f1996g = appVar;
        this.f1993d = otqVar;
        this.f1994e = callable;
        this.f1995f = otqVar2;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((apg) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x013e A[Catch: all -> 0x0166, TRY_LEAVE, TryCatch #1 {all -> 0x0166, blocks: (B:57:0x0136, B:59:0x013e), top: B:75:0x0136 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0159 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0168 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0157 -> B:80:0x0129). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final java.lang.Object mo561b(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.apg.mo561b(java.lang.Object):java.lang.Object");
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new apg(this.f1992c, this.f1996g, this.f1993d, this.f1994e, this.f1995f, olsVar);
    }
}

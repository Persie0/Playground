package p338qd;

import android.content.Context;
import com.google.android.play.core.assetpacks.C3111b;
import java.io.File;
import td.C9269q;
import td.C9270r;
import td.InterfaceC9268p;
import td.InterfaceC9271s;

/* JADX INFO: renamed from: qd.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8595z0 implements InterfaceC9271s {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9271s f46060a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9271s f46061b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9271s f46062c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9271s f46063d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9271s f46064e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC9271s f46065f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC9271s f46066g;

    public C8595z0(InterfaceC9271s interfaceC9271s, C9269q c9269q, InterfaceC9271s interfaceC9271s2, C8586v1 c8586v1, InterfaceC9271s interfaceC9271s3, InterfaceC9271s interfaceC9271s4, InterfaceC9271s interfaceC9271s5) {
        this.f46060a = interfaceC9271s;
        this.f46061b = c9269q;
        this.f46062c = interfaceC9271s2;
        this.f46063d = c8586v1;
        this.f46064e = interfaceC9271s3;
        this.f46065f = interfaceC9271s4;
        this.f46066g = interfaceC9271s5;
    }

    @Override // td.InterfaceC9271s
    public final /* bridge */ /* synthetic */ Object zza() {
        String str = (String) this.f46060a.zza();
        Object objZza = this.f46061b.zza();
        Object objZza2 = this.f46062c.zza();
        Context contextM16807a = ((C8586v1) this.f46063d).m16807a();
        Object objZza3 = this.f46064e.zza();
        InterfaceC9268p interfaceC9268pM17630a = C9270r.m17630a(this.f46065f);
        C3111b c3111b = (C3111b) objZza;
        C8547i1 c8547i1 = (C8547i1) objZza3;
        return new C8593y0(str != null ? new File(contextM16807a.getExternalFilesDir(null), str) : contextM16807a.getExternalFilesDir(null), c3111b, contextM16807a, c8547i1, interfaceC9268pM17630a);
    }
}

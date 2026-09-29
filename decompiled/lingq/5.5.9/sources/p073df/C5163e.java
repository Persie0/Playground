package p073df;

import android.support.v4.media.session.C0166e;
import com.google.firebase.installations.local.C3220a;
import com.google.firebase.installations.local.PersistedInstallation;
import p136gc.C5752h;

/* JADX INFO: renamed from: df.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5163e implements InterfaceC5167i {

    /* JADX INFO: renamed from: a */
    public final C5168j f33162a;

    /* JADX INFO: renamed from: b */
    public final C5752h<AbstractC5165g> f33163b;

    public C5163e(C5168j c5168j, C5752h<AbstractC5165g> c5752h) {
        this.f33162a = c5168j;
        this.f33163b = c5752h;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p073df.InterfaceC5167i
    /* JADX INFO: renamed from: a */
    public final boolean mo10941a(C3220a c3220a) {
        if (!(c3220a.mo9206f() == PersistedInstallation.RegistrationStatus.REGISTERED) || this.f33162a.m10944a(c3220a)) {
            return false;
        }
        String str = c3220a.f16271d;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        Long lValueOf = Long.valueOf(c3220a.f16273f);
        Long lValueOf2 = Long.valueOf(c3220a.f16274g);
        String strConcat = lValueOf == null ? "".concat(" tokenExpirationTimestamp") : "";
        if (lValueOf2 == null) {
            strConcat = C0166e.m765k(strConcat, " tokenCreationTimestamp");
        }
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        this.f33163b.m12114b(new C5159a(str, lValueOf.longValue(), lValueOf2.longValue()));
        return true;
    }

    @Override // p073df.InterfaceC5167i
    /* JADX INFO: renamed from: b */
    public final boolean mo10942b(Exception exc) {
        this.f33163b.m12115c(exc);
        return true;
    }
}

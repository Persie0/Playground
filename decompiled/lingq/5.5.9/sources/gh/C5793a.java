package gh;

import android.content.Context;
import com.kochava.core.profile.internal.ProfileLoadException;
import com.kochava.tracker.BuildConfig;
import p075dh.C5177e;
import p120fg.AbstractC5530a;
import p157hg.SharedPreferencesOnSharedPreferenceChangeListenerC6043a;
import p243lg.InterfaceC7361c;

/* JADX INFO: renamed from: gh.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5793a extends AbstractC5530a implements InterfaceC5794b {

    /* JADX INFO: renamed from: P */
    public static final Object f35002P = new Object();

    /* JADX INFO: renamed from: H */
    public C5795c f35003H;

    /* JADX INFO: renamed from: I */
    public C5801i f35004I;

    /* JADX INFO: renamed from: J */
    public C5177e f35005J;

    /* JADX INFO: renamed from: K */
    public C5177e f35006K;

    /* JADX INFO: renamed from: L */
    public C5177e f35007L;

    /* JADX INFO: renamed from: M */
    public C5177e f35008M;

    /* JADX INFO: renamed from: N */
    public C5177e f35009N;

    /* JADX INFO: renamed from: O */
    public C5177e f35010O;

    /* JADX INFO: renamed from: h */
    public final long f35011h;

    /* JADX INFO: renamed from: i */
    public C5798f f35012i;

    /* JADX INFO: renamed from: j */
    public C5796d f35013j;

    /* JADX INFO: renamed from: k */
    public C5797e f35014k;

    /* JADX INFO: renamed from: l */
    public C5802j f35015l;

    public C5793a(Context context, InterfaceC7361c interfaceC7361c, long j10) {
        super(context, interfaceC7361c);
        this.f35011h = j10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p120fg.AbstractC5530a
    /* JADX INFO: renamed from: e */
    public final void mo11772e() {
        Context context = this.f34212a;
        SharedPreferencesOnSharedPreferenceChangeListenerC6043a sharedPreferencesOnSharedPreferenceChangeListenerC6043a = new SharedPreferencesOnSharedPreferenceChangeListenerC6043a(context.getSharedPreferences(BuildConfig.PROFILE_NAME, 0), this.f34213b);
        C5177e c5177e = new C5177e(this.f34212a, this.f34213b, BuildConfig.PROFILE_EVENTS_QUEUE_NAME);
        C5177e c5177e2 = new C5177e(this.f34212a, this.f34213b, BuildConfig.PROFILE_UPDATES_QUEUE_NAME);
        C5177e c5177e3 = new C5177e(this.f34212a, this.f34213b, BuildConfig.PROFILE_IDENTITYLINK_QUEUE_NAME);
        C5177e c5177e4 = new C5177e(this.f34212a, this.f34213b, BuildConfig.PROFILE_TOKEN_QUEUE_NAME);
        C5177e c5177e5 = new C5177e(this.f34212a, this.f34213b, BuildConfig.PROFILE_SESSION_QUEUE_NAME);
        C5177e c5177e6 = new C5177e(this.f34212a, this.f34213b, BuildConfig.PROFILE_CLICKS_QUEUE_NAME);
        long j10 = this.f35011h;
        this.f35012i = new C5798f(sharedPreferencesOnSharedPreferenceChangeListenerC6043a, j10);
        this.f35013j = new C5796d(sharedPreferencesOnSharedPreferenceChangeListenerC6043a, j10);
        this.f35014k = new C5797e(sharedPreferencesOnSharedPreferenceChangeListenerC6043a);
        this.f35015l = new C5802j(sharedPreferencesOnSharedPreferenceChangeListenerC6043a);
        this.f35003H = new C5795c(sharedPreferencesOnSharedPreferenceChangeListenerC6043a);
        this.f35004I = new C5801i(sharedPreferencesOnSharedPreferenceChangeListenerC6043a, this.f35011h);
        synchronized (f35002P) {
            this.f35005J = c5177e;
            this.f35006K = c5177e2;
            this.f35007L = c5177e3;
            this.f35008M = c5177e4;
            this.f35009N = c5177e5;
            this.f35010O = c5177e6;
            this.f35012i.mo12193a();
            this.f35013j.mo12193a();
            this.f35014k.mo12193a();
            this.f35015l.mo12193a();
            this.f35003H.mo12193a();
            this.f35004I.mo12193a();
            if (this.f35012i.m12212k()) {
                C5800h.m12218b(this.f34212a, this.f35011h, this.f35012i, this.f35014k, this.f35003H);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final C5177e m12181g() throws ProfileLoadException {
        C5177e c5177e;
        m11773f();
        synchronized (f35002P) {
            c5177e = this.f35010O;
        }
        return c5177e;
    }

    /* JADX INFO: renamed from: h */
    public final C5795c m12182h() throws ProfileLoadException {
        C5795c c5795c;
        m11773f();
        synchronized (f35002P) {
            c5795c = this.f35003H;
        }
        return c5795c;
    }

    /* JADX INFO: renamed from: i */
    public final C5177e m12183i() throws ProfileLoadException {
        C5177e c5177e;
        m11773f();
        synchronized (f35002P) {
            c5177e = this.f35005J;
        }
        return c5177e;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final C5177e m12184j() throws ProfileLoadException {
        C5177e c5177e;
        m11773f();
        synchronized (f35002P) {
            c5177e = this.f35007L;
        }
        return c5177e;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final C5796d m12185k() throws ProfileLoadException {
        C5796d c5796d;
        m11773f();
        synchronized (f35002P) {
            c5796d = this.f35013j;
        }
        return c5796d;
    }

    /* JADX INFO: renamed from: l */
    public final C5797e m12186l() throws ProfileLoadException {
        C5797e c5797e;
        m11773f();
        synchronized (f35002P) {
            c5797e = this.f35014k;
        }
        return c5797e;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: m */
    public final C5798f m12187m() throws ProfileLoadException {
        C5798f c5798f;
        m11773f();
        synchronized (f35002P) {
            c5798f = this.f35012i;
        }
        return c5798f;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n */
    public final C5801i m12188n() throws ProfileLoadException {
        C5801i c5801i;
        m11773f();
        synchronized (f35002P) {
            c5801i = this.f35004I;
        }
        return c5801i;
    }

    /* JADX INFO: renamed from: o */
    public final C5802j m12189o() throws ProfileLoadException {
        C5802j c5802j;
        m11773f();
        synchronized (f35002P) {
            c5802j = this.f35015l;
        }
        return c5802j;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: p */
    public final C5177e m12190p() throws ProfileLoadException {
        C5177e c5177e;
        m11773f();
        synchronized (f35002P) {
            c5177e = this.f35009N;
        }
        return c5177e;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public final C5177e m12191q() throws ProfileLoadException {
        C5177e c5177e;
        m11773f();
        synchronized (f35002P) {
            c5177e = this.f35008M;
        }
        return c5177e;
    }

    /* JADX INFO: renamed from: r */
    public final C5177e m12192r() throws ProfileLoadException {
        C5177e c5177e;
        m11773f();
        synchronized (f35002P) {
            c5177e = this.f35006K;
        }
        return c5177e;
    }
}

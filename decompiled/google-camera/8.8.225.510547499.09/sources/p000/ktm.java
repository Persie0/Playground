package p000;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ktm implements ktf {

    /* JADX INFO: renamed from: a */
    public static volatile ktm f37166a;

    /* JADX INFO: renamed from: b */
    public static final Object f37167b = new Object();

    /* JADX INFO: renamed from: c */
    public final Context f37168c;

    /* JADX INFO: renamed from: d */
    private mrm f37169d = mqu.f41450a;

    /* JADX INFO: renamed from: e */
    private final Object f37170e = new Object();

    /* JADX INFO: renamed from: f */
    private final lhz f37171f;

    public ktm(Context context, lhz lhzVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f37168c = context.getApplicationContext();
        this.f37171f = lhzVar;
    }

    @Override // p000.ktf
    /* JADX INFO: renamed from: a */
    public final boolean mo14833a() {
        boolean zBooleanValue;
        synchronized (this.f37170e) {
            zBooleanValue = this.f37169d.mo16813g() ? ((Boolean) this.f37169d.mo16809c()).booleanValue() : m14838b();
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14838b() {
        boolean z;
        synchronized (this.f37170e) {
            try {
                try {
                    z = true;
                    if (Settings.Global.getInt(((Context) this.f37171f.f38277a).getContentResolver(), "multi_cb") != 1) {
                        z = false;
                    }
                    this.f37169d = mrm.m16829i(Boolean.valueOf(z));
                } catch (Settings.SettingNotFoundException e) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}

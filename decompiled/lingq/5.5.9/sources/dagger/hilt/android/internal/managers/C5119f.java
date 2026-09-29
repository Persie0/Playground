package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import dm.C5206f;
import mk.C7584e;
import mk.C7587f;
import p385sf.C9000b;
import pl.InterfaceC8405b;

/* JADX INFO: renamed from: dagger.hilt.android.internal.managers.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C5119f implements InterfaceC8405b<Object> {

    /* JADX INFO: renamed from: a */
    public volatile C7587f f33099a;

    /* JADX INFO: renamed from: b */
    public final Object f33100b = new Object();

    /* JADX INFO: renamed from: c */
    public final Fragment f33101c;

    /* JADX INFO: renamed from: dagger.hilt.android.internal.managers.f$a */
    public interface a {
        /* JADX INFO: renamed from: d */
        C7584e mo10899d();
    }

    public C5119f(Fragment fragment) {
        this.f33101c = fragment;
    }

    /* JADX INFO: renamed from: b */
    public static final Context m10897b(ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper) {
        Context baseContext = viewComponentManager$FragmentContextWrapper;
        while ((baseContext instanceof ContextWrapper) && !(baseContext instanceof Activity)) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return baseContext;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final Object m10898a() {
        Fragment fragment = this.f33101c;
        if (fragment.m3596o() == null) {
            throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
        }
        C5206f.m11030y0(fragment.m3596o() instanceof InterfaceC8405b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", fragment.m3596o().getClass());
        C7584e c7584eMo10899d = ((a) C9000b.m17245k(a.class, fragment.m3596o())).mo10899d();
        c7584eMo10899d.getClass();
        c7584eMo10899d.getClass();
        return new C7587f(c7584eMo10899d.f41852a, c7584eMo10899d.f41853b);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // pl.InterfaceC8405b
    /* JADX INFO: renamed from: d */
    public final Object mo469d() {
        if (this.f33099a == null) {
            synchronized (this.f33100b) {
                if (this.f33099a == null) {
                    this.f33099a = (C7587f) m10898a();
                }
            }
        }
        return this.f33099a;
    }
}

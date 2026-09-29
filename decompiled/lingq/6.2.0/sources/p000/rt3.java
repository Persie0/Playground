package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.lingq.core.player.C1808b;
import com.lingq.feature.challenges.ChallengeDetailsFragment;
import com.lingq.feature.challenges.ChallengesFragment;
import com.lingq.feature.imports.UserImportFragment;
import com.lingq.feature.more.MoreFragment;
import com.lingq.feature.onboarding.OnboardingEndFragment;
import com.lingq.feature.playlist.CollectionPlaylistFragment;
import com.lingq.feature.playlist.PlaylistFragment;
import com.lingq.feature.reader.old.ReaderFragment;
import com.lingq.feature.reader.old.ReaderPageFragment;
import com.lingq.feature.reader.old.settings.LessonReviewMenuFragment;
import com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment;
import com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment;
import com.lingq.feature.review.activities.ReviewActivityFlashcardFragment;
import com.lingq.feature.review.activities.ReviewActivityResultFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rt3 extends AbstractComponentCallbacksC0635c implements nk3 {

    /* JADX INFO: renamed from: A0 */
    public final Object f59789A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f59790B0;

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ int f59791w0;

    /* JADX INFO: renamed from: x0 */
    public eta f59792x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f59793y0;

    /* JADX INFO: renamed from: z0 */
    public volatile C3159jt f59794z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt3(int i, int i2) {
        super(i);
        this.f59791w0 = i2;
        switch (i2) {
            case 1:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 2:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 3:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 4:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 5:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 6:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 7:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 8:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 9:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 10:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 11:
            default:
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 12:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 13:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 14:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 15:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 16:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 17:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 18:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 19:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 20:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
            case 21:
                super(i);
                this.f59793y0 = false;
                this.f59789A0 = new Object();
                this.f59790B0 = false;
                break;
        }
    }

    /* JADX INFO: renamed from: c0 */
    private final Object m20778c0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: d0 */
    private final Object m20779d0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: e0 */
    private final Object m20780e0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: f0 */
    private final Object m20781f0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: g0 */
    private final Object m20782g0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: h0 */
    private final Object m20783h0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: i0 */
    private final Object m20784i0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: j0 */
    private final Object m20785j0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: k0 */
    private final Object m20786k0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: l0 */
    private final Object m20787l0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: m0 */
    private final Object m20788m0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: n0 */
    private final Object m20789n0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: o0 */
    private final Object m20790o0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: p0 */
    private final Object m20791p0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: q0 */
    private final Object m20792q0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: r0 */
    private final Object m20793r0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: s0 */
    private final Object m20794s0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: t0 */
    private final Object m20795t0() {
        if (this.f59794z0 == null) {
            synchronized (this.f59789A0) {
                try {
                    if (this.f59794z0 == null) {
                        this.f59794z0 = new C3159jt(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f59794z0.mo6995b();
    }

    /* JADX INFO: renamed from: A0 */
    public void m20796A0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m20797B0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m20798C0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m20799D0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: E */
    public final LayoutInflater mo2078E(Bundle bundle) {
        switch (this.f59791w0) {
            case 0:
                LayoutInflater layoutInflaterMo2078E = super.mo2078E(bundle);
                return layoutInflaterMo2078E.cloneInContext(new eta(layoutInflaterMo2078E, this));
            case 1:
                LayoutInflater layoutInflaterMo2078E2 = super.mo2078E(bundle);
                return layoutInflaterMo2078E2.cloneInContext(new eta(layoutInflaterMo2078E2, this));
            case 2:
                LayoutInflater layoutInflaterMo2078E3 = super.mo2078E(bundle);
                return layoutInflaterMo2078E3.cloneInContext(new eta(layoutInflaterMo2078E3, this));
            case 3:
                LayoutInflater layoutInflaterMo2078E4 = super.mo2078E(bundle);
                return layoutInflaterMo2078E4.cloneInContext(new eta(layoutInflaterMo2078E4, this));
            case 4:
                LayoutInflater layoutInflaterMo2078E5 = super.mo2078E(bundle);
                return layoutInflaterMo2078E5.cloneInContext(new eta(layoutInflaterMo2078E5, this));
            case 5:
                LayoutInflater layoutInflaterMo2078E6 = super.mo2078E(bundle);
                return layoutInflaterMo2078E6.cloneInContext(new eta(layoutInflaterMo2078E6, this));
            case 6:
                LayoutInflater layoutInflaterMo2078E7 = super.mo2078E(bundle);
                return layoutInflaterMo2078E7.cloneInContext(new eta(layoutInflaterMo2078E7, this));
            case 7:
                LayoutInflater layoutInflaterMo2078E8 = super.mo2078E(bundle);
                return layoutInflaterMo2078E8.cloneInContext(new eta(layoutInflaterMo2078E8, this));
            case 8:
                LayoutInflater layoutInflaterMo2078E9 = super.mo2078E(bundle);
                return layoutInflaterMo2078E9.cloneInContext(new eta(layoutInflaterMo2078E9, this));
            case 9:
                LayoutInflater layoutInflaterMo2078E10 = super.mo2078E(bundle);
                return layoutInflaterMo2078E10.cloneInContext(new eta(layoutInflaterMo2078E10, this));
            case 10:
                LayoutInflater layoutInflaterMo2078E11 = super.mo2078E(bundle);
                return layoutInflaterMo2078E11.cloneInContext(new eta(layoutInflaterMo2078E11, this));
            case 11:
                LayoutInflater layoutInflaterMo2078E12 = super.mo2078E(bundle);
                return layoutInflaterMo2078E12.cloneInContext(new eta(layoutInflaterMo2078E12, this));
            case 12:
                LayoutInflater layoutInflaterMo2078E13 = super.mo2078E(bundle);
                return layoutInflaterMo2078E13.cloneInContext(new eta(layoutInflaterMo2078E13, this));
            case 13:
                LayoutInflater layoutInflaterMo2078E14 = super.mo2078E(bundle);
                return layoutInflaterMo2078E14.cloneInContext(new eta(layoutInflaterMo2078E14, this));
            case 14:
                LayoutInflater layoutInflaterMo2078E15 = super.mo2078E(bundle);
                return layoutInflaterMo2078E15.cloneInContext(new eta(layoutInflaterMo2078E15, this));
            case 15:
                LayoutInflater layoutInflaterMo2078E16 = super.mo2078E(bundle);
                return layoutInflaterMo2078E16.cloneInContext(new eta(layoutInflaterMo2078E16, this));
            case 16:
                LayoutInflater layoutInflaterMo2078E17 = super.mo2078E(bundle);
                return layoutInflaterMo2078E17.cloneInContext(new eta(layoutInflaterMo2078E17, this));
            case 17:
                LayoutInflater layoutInflaterMo2078E18 = super.mo2078E(bundle);
                return layoutInflaterMo2078E18.cloneInContext(new eta(layoutInflaterMo2078E18, this));
            case 18:
                LayoutInflater layoutInflaterMo2078E19 = super.mo2078E(bundle);
                return layoutInflaterMo2078E19.cloneInContext(new eta(layoutInflaterMo2078E19, this));
            case 19:
                LayoutInflater layoutInflaterMo2078E20 = super.mo2078E(bundle);
                return layoutInflaterMo2078E20.cloneInContext(new eta(layoutInflaterMo2078E20, this));
            case 20:
                LayoutInflater layoutInflaterMo2078E21 = super.mo2078E(bundle);
                return layoutInflaterMo2078E21.cloneInContext(new eta(layoutInflaterMo2078E21, this));
            default:
                LayoutInflater layoutInflaterMo2078E22 = super.mo2078E(bundle);
                return layoutInflaterMo2078E22.cloneInContext(new eta(layoutInflaterMo2078E22, this));
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m20800E0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: F0 */
    public void m20801F0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m20802G0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m20803H0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m20804I0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m20805J0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m20806K0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m20807L0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m20808M0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m20809N0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m20810O0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m20811P0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m20812Q0() {
        switch (this.f59791w0) {
            case 4:
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ny4 ny4Var = (ny4) mo6995b();
                    ky1 ky1Var = ((fy1) ny4Var).f39919b;
                }
                break;
            case 5:
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    a55 a55Var = (a55) mo6995b();
                    LessonMoveKnownFragment lessonMoveKnownFragment = (LessonMoveKnownFragment) this;
                    ky1 ky1Var2 = ((fy1) a55Var).f39919b;
                    lessonMoveKnownFragment.f29566F0 = (C3509qs) ky1Var2.f48768z.get();
                    lessonMoveKnownFragment.f29567G0 = (hm5) ky1Var2.f48736r.get();
                }
                break;
            case 6:
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ((LessonReviewMenuFragment) this).f29431F0 = (C3509qs) ((fy1) ((h65) mo6995b())).f39919b.f48768z.get();
                }
                break;
            case 7:
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ((LessonVocabularyFragment) this).f29680F0 = (bia) ((fy1) ((d75) mo6995b())).f39919b.f48652U1.get();
                }
                break;
            case 8:
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    be5 be5Var = (be5) mo6995b();
                    ky1 ky1Var3 = ((fy1) be5Var).f39919b;
                }
                break;
            case 9:
            case 11:
            default:
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ky1 ky1Var4 = ((fy1) ((wb8) mo6995b())).f39919b;
                    ((ReviewActivityResultFragment) this).f32072G0 = (ig8) ky1Var4.f48740s.get();
                }
                break;
            case 10:
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    rt6 rt6Var = (rt6) mo6995b();
                    OnboardingEndFragment onboardingEndFragment = (OnboardingEndFragment) this;
                    fy1 fy1Var = (fy1) rt6Var;
                    ky1 ky1Var5 = fy1Var.f39919b;
                    onboardingEndFragment.f26910E0 = (hm5) ky1Var5.f48736r.get();
                    onboardingEndFragment.f26911F0 = (C3509qs) ky1Var5.f48768z.get();
                    onboardingEndFragment.f26912G0 = fy1Var.m12244a();
                }
                break;
            case 12:
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ax7 ax7Var = (ax7) mo6995b();
                    ReaderFragment readerFragment = (ReaderFragment) this;
                    fy1 fy1Var2 = (fy1) ax7Var;
                    ky1 ky1Var6 = fy1Var2.f39919b;
                    readerFragment.f28228L0 = (hm5) ky1Var6.f48736r.get();
                    readerFragment.f28229M0 = (C3509qs) ky1Var6.f48768z.get();
                    readerFragment.f28230N0 = (C1808b) ky1Var6.f48667Z1.get();
                    readerFragment.f28231O0 = fy1Var2.m12244a();
                }
                break;
            case 13:
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    cy7 cy7Var = (cy7) mo6995b();
                    ReaderPageFragment readerPageFragment = (ReaderPageFragment) this;
                    ky1 ky1Var7 = ((fy1) cy7Var).f39919b;
                    readerPageFragment.f28448J0 = (hm5) ky1Var7.f48736r.get();
                    readerPageFragment.f28449K0 = (C3509qs) ky1Var7.f48768z.get();
                }
                break;
            case 14:
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ((ReviewActivityFlashcardFragment) this).f31918G0 = (ig8) ((fy1) ((pb8) mo6995b())).f39919b.f48740s.get();
                }
                break;
        }
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        switch (this.f59791w0) {
            case 0:
                if (this.f59794z0 == null) {
                    synchronized (this.f59789A0) {
                        try {
                            if (this.f59794z0 == null) {
                                this.f59794z0 = new C3159jt(this);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return this.f59794z0.mo6995b();
            case 1:
                if (this.f59794z0 == null) {
                    synchronized (this.f59789A0) {
                        try {
                            if (this.f59794z0 == null) {
                                this.f59794z0 = new C3159jt(this);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return this.f59794z0.mo6995b();
            case 2:
                if (this.f59794z0 == null) {
                    synchronized (this.f59789A0) {
                        try {
                            if (this.f59794z0 == null) {
                                this.f59794z0 = new C3159jt(this);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                }
                return this.f59794z0.mo6995b();
            case 3:
                return m20778c0();
            case 4:
                return m20779d0();
            case 5:
                return m20780e0();
            case 6:
                return m20781f0();
            case 7:
                return m20782g0();
            case 8:
                return m20783h0();
            case 9:
                return m20784i0();
            case 10:
                return m20785j0();
            case 11:
                return m20786k0();
            case 12:
                return m20787l0();
            case 13:
                return m20788m0();
            case 14:
                return m20789n0();
            case 15:
                return m20790o0();
            case 16:
                return m20791p0();
            case 17:
                return m20792q0();
            case 18:
                return m20793r0();
            case 19:
                return m20794s0();
            case 20:
                return m20795t0();
            default:
                if (this.f59794z0 == null) {
                    synchronized (this.f59789A0) {
                        try {
                            if (this.f59794z0 == null) {
                                this.f59794z0 = new C3159jt(this);
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                        break;
                    }
                }
                return this.f59794z0.mo6995b();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c, p000.gr3
    /* JADX INFO: renamed from: d */
    public final zta mo2102d() {
        switch (this.f59791w0) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
        }
        return eh0.m11143x(this, super.mo2102d());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: i */
    public final Context mo2107i() {
        switch (this.f59791w0) {
            case 0:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20814v0();
                return this.f59792x0;
            case 1:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20815w0();
                return this.f59792x0;
            case 2:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20796A0();
                return this.f59792x0;
            case 3:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20797B0();
                return this.f59792x0;
            case 4:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20804I0();
                return this.f59792x0;
            case 5:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20802G0();
                return this.f59792x0;
            case 6:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20801F0();
                return this.f59792x0;
            case 7:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20803H0();
                return this.f59792x0;
            case 8:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20813u0();
                return this.f59792x0;
            case 9:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20817y0();
                return this.f59792x0;
            case 10:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20818z0();
                return this.f59792x0;
            case 11:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20798C0();
                return this.f59792x0;
            case 12:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20799D0();
                return this.f59792x0;
            case 13:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20800E0();
                return this.f59792x0;
            case 14:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20806K0();
                return this.f59792x0;
            case 15:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20807L0();
                return this.f59792x0;
            case 16:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20808M0();
                return this.f59792x0;
            case 17:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20809N0();
                return this.f59792x0;
            case 18:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20810O0();
                return this.f59792x0;
            case 19:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20811P0();
                return this.f59792x0;
            case 20:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20805J0();
                return this.f59792x0;
            default:
                if (super.mo2107i() == null && !this.f59793y0) {
                    return null;
                }
                m20816x0();
                return this.f59792x0;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m20813u0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m20814v0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m20815w0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: x */
    public final void mo2122x(Activity activity) {
        boolean z = true;
        switch (this.f59791w0) {
            case 0:
                this.f5688b0 = true;
                eta etaVar = this.f59792x0;
                thb.m22048g(etaVar == null || C3159jt.m14640c(etaVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20814v0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ((ChallengeDetailsFragment) this).f24350F0 = ((fy1) ((ar0) mo6995b())).m12244a();
                }
                break;
            case 1:
                this.f5688b0 = true;
                eta etaVar2 = this.f59792x0;
                thb.m22048g(etaVar2 == null || C3159jt.m14640c(etaVar2) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20815w0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ((ChallengesFragment) this).f24441F0 = ((fy1) ((vs0) mo6995b())).m12244a();
                }
                break;
            case 2:
                this.f5688b0 = true;
                eta etaVar3 = this.f59792x0;
                thb.m22048g(etaVar3 == null || C3159jt.m14640c(etaVar3) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20796A0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    d01 d01Var = (d01) mo6995b();
                    d01Var.getClass();
                }
                break;
            case 3:
                this.f5688b0 = true;
                eta etaVar4 = this.f59792x0;
                thb.m22048g(etaVar4 == null || C3159jt.m14640c(etaVar4) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20797B0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ((CollectionPlaylistFragment) this).f27527D0 = ((fy1) ((a91) mo6995b())).m12244a();
                }
                break;
            case 4:
                this.f5688b0 = true;
                eta etaVar5 = this.f59792x0;
                if (etaVar5 != null && C3159jt.m14640c(etaVar5) != activity) {
                    z = false;
                }
                thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20804I0();
                m20812Q0();
                break;
            case 5:
                this.f5688b0 = true;
                eta etaVar6 = this.f59792x0;
                if (etaVar6 != null && C3159jt.m14640c(etaVar6) != activity) {
                    z = false;
                }
                thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20802G0();
                m20812Q0();
                break;
            case 6:
                this.f5688b0 = true;
                eta etaVar7 = this.f59792x0;
                if (etaVar7 != null && C3159jt.m14640c(etaVar7) != activity) {
                    z = false;
                }
                thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20801F0();
                m20812Q0();
                break;
            case 7:
                this.f5688b0 = true;
                eta etaVar8 = this.f59792x0;
                if (etaVar8 != null && C3159jt.m14640c(etaVar8) != activity) {
                    z = false;
                }
                thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20803H0();
                m20812Q0();
                break;
            case 8:
                this.f5688b0 = true;
                eta etaVar9 = this.f59792x0;
                if (etaVar9 != null && C3159jt.m14640c(etaVar9) != activity) {
                    z = false;
                }
                thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20813u0();
                m20812Q0();
                break;
            case 9:
                this.f5688b0 = true;
                eta etaVar10 = this.f59792x0;
                thb.m22048g(etaVar10 == null || C3159jt.m14640c(etaVar10) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20817y0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ((MoreFragment) this).f26809D0 = ((fy1) ((e26) mo6995b())).m12244a();
                }
                break;
            case 10:
                this.f5688b0 = true;
                eta etaVar11 = this.f59792x0;
                if (etaVar11 != null && C3159jt.m14640c(etaVar11) != activity) {
                    z = false;
                }
                thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20818z0();
                m20812Q0();
                break;
            case 11:
                this.f5688b0 = true;
                eta etaVar12 = this.f59792x0;
                thb.m22048g(etaVar12 == null || C3159jt.m14640c(etaVar12) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20798C0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ((PlaylistFragment) this).f27590D0 = ((fy1) ((qd7) mo6995b())).m12244a();
                }
                break;
            case 12:
                this.f5688b0 = true;
                eta etaVar13 = this.f59792x0;
                if (etaVar13 != null && C3159jt.m14640c(etaVar13) != activity) {
                    z = false;
                }
                thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20799D0();
                m20812Q0();
                break;
            case 13:
                this.f5688b0 = true;
                eta etaVar14 = this.f59792x0;
                if (etaVar14 != null && C3159jt.m14640c(etaVar14) != activity) {
                    z = false;
                }
                thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20800E0();
                m20812Q0();
                break;
            case 14:
                this.f5688b0 = true;
                eta etaVar15 = this.f59792x0;
                if (etaVar15 != null && C3159jt.m14640c(etaVar15) != activity) {
                    z = false;
                }
                thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20806K0();
                m20812Q0();
                break;
            case 15:
                this.f5688b0 = true;
                eta etaVar16 = this.f59792x0;
                thb.m22048g(etaVar16 == null || C3159jt.m14640c(etaVar16) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20807L0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    qb8 qb8Var = (qb8) mo6995b();
                    qb8Var.getClass();
                }
                break;
            case 16:
                this.f5688b0 = true;
                eta etaVar17 = this.f59792x0;
                thb.m22048g(etaVar17 == null || C3159jt.m14640c(etaVar17) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20808M0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    tb8 tb8Var = (tb8) mo6995b();
                }
                break;
            case 17:
                this.f5688b0 = true;
                eta etaVar18 = this.f59792x0;
                if (etaVar18 != null && C3159jt.m14640c(etaVar18) != activity) {
                    z = false;
                }
                thb.m22048g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20809N0();
                m20812Q0();
                break;
            case 18:
                this.f5688b0 = true;
                eta etaVar19 = this.f59792x0;
                thb.m22048g(etaVar19 == null || C3159jt.m14640c(etaVar19) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20810O0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    zb8 zb8Var = (zb8) mo6995b();
                    zb8Var.getClass();
                }
                break;
            case 19:
                this.f5688b0 = true;
                eta etaVar20 = this.f59792x0;
                thb.m22048g(etaVar20 == null || C3159jt.m14640c(etaVar20) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20811P0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    cc8 cc8Var = (cc8) mo6995b();
                    cc8Var.getClass();
                }
                break;
            case 20:
                this.f5688b0 = true;
                eta etaVar21 = this.f59792x0;
                thb.m22048g(etaVar21 == null || C3159jt.m14640c(etaVar21) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20805J0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ve8 ve8Var = (ve8) mo6995b();
                }
                break;
            default:
                this.f5688b0 = true;
                eta etaVar22 = this.f59792x0;
                thb.m22048g(etaVar22 == null || C3159jt.m14640c(etaVar22) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                m20816x0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ((UserImportFragment) this).f26005G0 = ((fy1) ((tka) mo6995b())).m12244a();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void m20816x0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: y */
    public final void mo2123y(Context context) {
        switch (this.f59791w0) {
            case 0:
                super.mo2123y(context);
                m20814v0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ((ChallengeDetailsFragment) this).f24350F0 = ((fy1) ((ar0) mo6995b())).m12244a();
                }
                break;
            case 1:
                super.mo2123y(context);
                m20815w0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ((ChallengesFragment) this).f24441F0 = ((fy1) ((vs0) mo6995b())).m12244a();
                }
                break;
            case 2:
                super.mo2123y(context);
                m20796A0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    d01 d01Var = (d01) mo6995b();
                    d01Var.getClass();
                }
                break;
            case 3:
                super.mo2123y(context);
                m20797B0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ((CollectionPlaylistFragment) this).f27527D0 = ((fy1) ((a91) mo6995b())).m12244a();
                }
                break;
            case 4:
                super.mo2123y(context);
                m20804I0();
                m20812Q0();
                break;
            case 5:
                super.mo2123y(context);
                m20802G0();
                m20812Q0();
                break;
            case 6:
                super.mo2123y(context);
                m20801F0();
                m20812Q0();
                break;
            case 7:
                super.mo2123y(context);
                m20803H0();
                m20812Q0();
                break;
            case 8:
                super.mo2123y(context);
                m20813u0();
                m20812Q0();
                break;
            case 9:
                super.mo2123y(context);
                m20817y0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ((MoreFragment) this).f26809D0 = ((fy1) ((e26) mo6995b())).m12244a();
                }
                break;
            case 10:
                super.mo2123y(context);
                m20818z0();
                m20812Q0();
                break;
            case 11:
                super.mo2123y(context);
                m20798C0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ((PlaylistFragment) this).f27590D0 = ((fy1) ((qd7) mo6995b())).m12244a();
                }
                break;
            case 12:
                super.mo2123y(context);
                m20799D0();
                m20812Q0();
                break;
            case 13:
                super.mo2123y(context);
                m20800E0();
                m20812Q0();
                break;
            case 14:
                super.mo2123y(context);
                m20806K0();
                m20812Q0();
                break;
            case 15:
                super.mo2123y(context);
                m20807L0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    qb8 qb8Var = (qb8) mo6995b();
                    qb8Var.getClass();
                }
                break;
            case 16:
                super.mo2123y(context);
                m20808M0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    tb8 tb8Var = (tb8) mo6995b();
                }
                break;
            case 17:
                super.mo2123y(context);
                m20809N0();
                m20812Q0();
                break;
            case 18:
                super.mo2123y(context);
                m20810O0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    zb8 zb8Var = (zb8) mo6995b();
                    zb8Var.getClass();
                }
                break;
            case 19:
                super.mo2123y(context);
                m20811P0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    cc8 cc8Var = (cc8) mo6995b();
                    cc8Var.getClass();
                }
                break;
            case 20:
                super.mo2123y(context);
                m20805J0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ve8 ve8Var = (ve8) mo6995b();
                }
                break;
            default:
                super.mo2123y(context);
                m20816x0();
                if (!this.f59790B0) {
                    this.f59790B0 = true;
                    ((UserImportFragment) this).f26005G0 = ((fy1) ((tka) mo6995b())).m12244a();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m20817y0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m20818z0() {
        if (this.f59792x0 == null) {
            this.f59792x0 = new eta(super.mo2107i(), this);
            this.f59793y0 = d32.m10022T(super.mo2107i());
        }
    }

    public rt3() {
        this.f59791w0 = 11;
        this.f59793y0 = false;
        this.f59789A0 = new Object();
        this.f59790B0 = false;
    }
}

package com.lingq.p055ui.info;

import ae.C0062b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p181ii.C6332a;
import p254m2.C7472a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$12", m19206f = "LessonInfoFragment.kt", m19207l = {363}, m19208m = "invokeSuspend")
public final class LessonInfoFragment$onViewCreated$7$12 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26867e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonInfoFragment f26868f;

    /* JADX INFO: renamed from: com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$12$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lii/a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$12$1", m19206f = "LessonInfoFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41381 extends SuspendLambda implements InterfaceC2056p<C6332a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26869e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonInfoFragment f26870f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41381(LessonInfoFragment lessonInfoFragment, InterfaceC9968c<? super C41381> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26870f = lessonInfoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41381 c41381 = new C41381(this.f26870f, interfaceC9968c);
            c41381.f26869e = obj;
            return c41381;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C6332a c6332a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41381) mo1336a(c6332a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0089 A[PHI: r0
          0x0089: PHI (r0v2 android.graphics.drawable.Drawable) = 
          (r0v1 android.graphics.drawable.Drawable)
          (r0v6 android.graphics.drawable.Drawable)
          (r0v1 android.graphics.drawable.Drawable)
         binds: [B:7:0x0020, B:25:0x007a, B:16:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C6332a c6332a = (C6332a) this.f26869e;
            if (c6332a != null) {
                Drawable drawableM14849b = null;
                LessonInfoFragment lessonInfoFragment = this.f26870f;
                String str = c6332a.f36586M;
                if (str != null) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = LessonInfoFragment.f26838X0;
                    ImageView imageView = lessonInfoFragment.m10098w0().f45070n;
                    if (str != null) {
                        int iHashCode = str.hashCode();
                        if (iHashCode != -1307827859) {
                            if (iHashCode != 94630981) {
                                if (iHashCode == 812757528) {
                                    if (str.equals("librarian")) {
                                        Context contextM3578a0 = lessonInfoFragment.m3578a0();
                                        Object obj2 = C7472a.f41322a;
                                        drawableM14849b = C7472a.c.m14849b(contextM3578a0, R.drawable.ic_profile_librarian);
                                    }
                                }
                            } else if (str.equals("chief")) {
                                Context contextM3578a1 = lessonInfoFragment.m3578a0();
                                Object obj3 = C7472a.f41322a;
                                drawableM14849b = C7472a.c.m14849b(contextM3578a1, R.drawable.ic_profile_chief_librarian);
                            }
                        } else if (str.equals("editor")) {
                            Context contextM3578a2 = lessonInfoFragment.m3578a0();
                            Object obj4 = C7472a.f41322a;
                            drawableM14849b = C7472a.c.m14849b(contextM3578a2, R.drawable.ic_profile_editor);
                        }
                    }
                    imageView.setImageDrawable(drawableM14849b);
                } else {
                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonInfoFragment.f26838X0;
                    lessonInfoFragment.m10098w0().f45070n.setImageDrawable(null);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoFragment$onViewCreated$7$12(LessonInfoFragment lessonInfoFragment, InterfaceC9968c<? super LessonInfoFragment$onViewCreated$7$12> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26868f = lessonInfoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoFragment$onViewCreated$7$12(this.f26868f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoFragment$onViewCreated$7$12) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26867e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonInfoFragment.f26838X0;
            LessonInfoFragment lessonInfoFragment = this.f26868f;
            LessonInfoViewModel lessonInfoViewModelM10099x0 = lessonInfoFragment.m10099x0();
            C41381 c41381 = new C41381(lessonInfoFragment, null);
            this.f26867e = 1;
            if (C0062b.m369m0(lessonInfoViewModelM10099x0.f26953i0, c41381, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}

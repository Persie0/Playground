package com.lingq.shared.download;

import ae.C0062b;
import android.content.Context;
import android.net.Uri;
import android.support.v4.media.session.C0166e;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.downloader.Progress;
import com.lingq.shared.storage.C3398a;
import com.lingq.shared.storage.LessonFont;
import dm.C5207g;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7140u;
import no.C7828f;
import no.C7843k;
import no.InterfaceC7840j;
import no.InterfaceC7882z;
import p111f7.InterfaceC5474b;
import p111f7.InterfaceC5475c;
import p259m7.C7493a;
import p259m7.C7497e;
import p260m8.C7499b;
import p338qd.C8573r0;
import p349qo.C8656b;
import p416uh.InterfaceC9529c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class FontDownloadManagerDelegateImpl implements InterfaceC9529c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7882z f17963a;

    /* JADX INFO: renamed from: b */
    public String f17964b;

    /* JADX INFO: renamed from: c */
    public final File f17965c;

    /* JADX INFO: renamed from: d */
    public final AbstractChannel f17966d;

    /* JADX INFO: renamed from: e */
    public final C7114a f17967e;

    /* JADX INFO: renamed from: f */
    public final C7138s f17968f;

    /* JADX INFO: renamed from: g */
    public final C7134o f17969g;

    /* JADX INFO: renamed from: com.lingq.shared.download.FontDownloadManagerDelegateImpl$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.shared.download.FontDownloadManagerDelegateImpl$1", m19206f = "FontDownloadManagerDelegate.kt", m19207l = {61}, m19208m = "invokeSuspend")
    public static final class C33111 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f17970e;

        /* JADX INFO: renamed from: com.lingq.shared.download.FontDownloadManagerDelegateImpl$1$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC7117d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ FontDownloadManagerDelegateImpl f17972a;

            /* JADX INFO: renamed from: com.lingq.shared.download.FontDownloadManagerDelegateImpl$1$1$a */
            public static final class a implements InterfaceC5475c {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ FontDownloadManagerDelegateImpl f17973a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ LessonFont f17974b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC7840j<Boolean> f17975c;

                public a(FontDownloadManagerDelegateImpl fontDownloadManagerDelegateImpl, LessonFont lessonFont, C7843k c7843k) {
                    this.f17973a = fontDownloadManagerDelegateImpl;
                    this.f17974b = lessonFont;
                    this.f17975c = c7843k;
                }

                @Override // p111f7.InterfaceC5475c
                /* JADX INFO: renamed from: a */
                public final void mo9442a(Progress progress) {
                    long j10 = progress.f11366a;
                    long j11 = progress.f11367b;
                    int i10 = (int) ((j10 / j11) * 100);
                    boolean z10 = 1 <= i10 && i10 < 100;
                    LessonFont lessonFont = this.f17974b;
                    FontDownloadManagerDelegateImpl fontDownloadManagerDelegateImpl = this.f17973a;
                    if (z10 && j10 < j11) {
                        fontDownloadManagerDelegateImpl.f17968f.mo14371k(new AbstractC3312a.c(i10, lessonFont));
                        return;
                    }
                    if (i10 == 100 || j10 >= j11) {
                        fontDownloadManagerDelegateImpl.f17964b = null;
                        fontDownloadManagerDelegateImpl.f17968f.mo14371k(new AbstractC3312a.a(lessonFont));
                        InterfaceC7840j<Boolean> interfaceC7840j = this.f17975c;
                        if (interfaceC7840j.mo15579b()) {
                            interfaceC7840j.mo2031y(Boolean.TRUE);
                        }
                    }
                }
            }

            /* JADX INFO: renamed from: com.lingq.shared.download.FontDownloadManagerDelegateImpl$1$1$b */
            public static final class b implements InterfaceC5474b {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ FontDownloadManagerDelegateImpl f17976a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ LessonFont f17977b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC7840j<Boolean> f17978c;

                public b(FontDownloadManagerDelegateImpl fontDownloadManagerDelegateImpl, LessonFont lessonFont, C7843k c7843k) {
                    this.f17976a = fontDownloadManagerDelegateImpl;
                    this.f17977b = lessonFont;
                    this.f17978c = c7843k;
                }

                @Override // p111f7.InterfaceC5474b
                /* JADX INFO: renamed from: a */
                public final void mo9443a() {
                    FontDownloadManagerDelegateImpl fontDownloadManagerDelegateImpl = this.f17976a;
                    fontDownloadManagerDelegateImpl.f17964b = null;
                    C7138s c7138s = fontDownloadManagerDelegateImpl.f17968f;
                    LessonFont lessonFont = this.f17977b;
                    c7138s.mo14371k(new AbstractC3312a.b(lessonFont));
                    InterfaceC7840j<Boolean> interfaceC7840j = this.f17978c;
                    if (interfaceC7840j.mo15579b()) {
                        interfaceC7840j.mo2031y(C7499b.m14967u(new Exception("Error in download ".concat(C3398a.m9698a(lessonFont)))));
                    }
                }

                @Override // p111f7.InterfaceC5474b
                /* JADX INFO: renamed from: b */
                public final void mo9444b() {
                    FontDownloadManagerDelegateImpl fontDownloadManagerDelegateImpl = this.f17976a;
                    fontDownloadManagerDelegateImpl.f17964b = null;
                    fontDownloadManagerDelegateImpl.f17968f.mo14371k(new AbstractC3312a.a(this.f17977b));
                    InterfaceC7840j<Boolean> interfaceC7840j = this.f17978c;
                    if (interfaceC7840j.mo15579b()) {
                        interfaceC7840j.mo2031y(Boolean.TRUE);
                    }
                }
            }

            public AnonymousClass1(FontDownloadManagerDelegateImpl fontDownloadManagerDelegateImpl) {
                this.f17972a = fontDownloadManagerDelegateImpl;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x001a  */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlinx.coroutines.flow.InterfaceC7117d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1339r(LessonFont lessonFont, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
                FontDownloadManagerDelegateImpl$1$1$emit$1 fontDownloadManagerDelegateImpl$1$1$emit$1;
                if (interfaceC9968c instanceof FontDownloadManagerDelegateImpl$1$1$emit$1) {
                    fontDownloadManagerDelegateImpl$1$1$emit$1 = (FontDownloadManagerDelegateImpl$1$1$emit$1) interfaceC9968c;
                    int i10 = fontDownloadManagerDelegateImpl$1$1$emit$1.f17981f;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        fontDownloadManagerDelegateImpl$1$1$emit$1.f17981f = i10 - Integer.MIN_VALUE;
                    } else {
                        fontDownloadManagerDelegateImpl$1$1$emit$1 = new FontDownloadManagerDelegateImpl$1$1$emit$1(this, interfaceC9968c);
                    }
                } else {
                    fontDownloadManagerDelegateImpl$1$1$emit$1 = new FontDownloadManagerDelegateImpl$1$1$emit$1(this, interfaceC9968c);
                }
                Object obj = fontDownloadManagerDelegateImpl$1$1$emit$1.f17979d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = fontDownloadManagerDelegateImpl$1$1$emit$1.f17981f;
                try {
                    if (i11 == 0) {
                        C7499b.m14977z0(obj);
                        FontDownloadManagerDelegateImpl fontDownloadManagerDelegateImpl = this.f17972a;
                        fontDownloadManagerDelegateImpl$1$1$emit$1.getClass();
                        fontDownloadManagerDelegateImpl$1$1$emit$1.getClass();
                        fontDownloadManagerDelegateImpl$1$1$emit$1.f17981f = 1;
                        C7843k c7843k = new C7843k(1, C8656b.m16874A(fontDownloadManagerDelegateImpl$1$1$emit$1));
                        c7843k.m15594r();
                        File file = new File(fontDownloadManagerDelegateImpl.f17965c + "/" + C3398a.m9698a(lessonFont));
                        if (!file.exists() && !C5207g.m11106a(C3398a.m9698a(lessonFont), fontDownloadManagerDelegateImpl.f17964b)) {
                            fontDownloadManagerDelegateImpl.f17964b = C3398a.m9698a(lessonFont);
                            C7497e c7497e = new C7497e(Uri.parse("https://www.lingq.com/static/fonts/android/".concat(C3398a.m9698a(lessonFont))).toString(), fontDownloadManagerDelegateImpl.f17965c.toString(), C3398a.m9698a(lessonFont));
                            c7497e.f41412e = C3398a.m9698a(lessonFont);
                            C7493a c7493a = new C7493a(c7497e);
                            c7493a.f41399m = new a(fontDownloadManagerDelegateImpl, lessonFont, c7843k);
                            c7493a.m14891c(new b(fontDownloadManagerDelegateImpl, lessonFont, c7843k));
                        } else if (file.exists() || C5207g.m11106a(C3398a.m9698a(lessonFont), fontDownloadManagerDelegateImpl.f17964b)) {
                            c7843k.mo2031y(Boolean.FALSE);
                        }
                        if (c7843k.m15593p() == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(obj);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                return C9072e.f47360a;
            }
        }

        public C33111(InterfaceC9968c<? super C33111> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return FontDownloadManagerDelegateImpl.this.new C33111(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C33111) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f17970e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                FontDownloadManagerDelegateImpl fontDownloadManagerDelegateImpl = FontDownloadManagerDelegateImpl.this;
                C7114a c7114a = fontDownloadManagerDelegateImpl.f17967e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(fontDownloadManagerDelegateImpl);
                this.f17970e = 1;
                if (c7114a.mo9539a(anonymousClass1, this) == coroutineSingletons) {
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

    public FontDownloadManagerDelegateImpl(Context context, InterfaceC7882z interfaceC7882z) {
        C5207g.m11111f(interfaceC7882z, "coroutineScope");
        this.f17963a = interfaceC7882z;
        this.f17965c = new File(C0166e.m765k(context.getFilesDir().toString(), "/fonts/"));
        AbstractChannel abstractChannelM16738m = C8573r0.m16738m(1, BufferOverflow.SUSPEND, 4);
        this.f17966d = abstractChannelM16738m;
        this.f17967e = C0062b.m287L1(abstractChannelM16738m);
        C7138s c7138sM372n = C0062b.m372n(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.f17968f = c7138sM372n;
        this.f17969g = C0062b.m341d2(c7138sM372n, interfaceC7882z, InterfaceC7140u.a.f40388b);
        C7828f.m15570d(interfaceC7882z, null, null, new C33111(null), 3);
    }

    @Override // p416uh.InterfaceC9529c
    /* JADX INFO: renamed from: C0 */
    public final InterfaceC7137r<AbstractC3312a<LessonFont>> mo9447C0() {
        return this.f17969g;
    }

    @Override // p416uh.InterfaceC9529c
    /* JADX INFO: renamed from: n0 */
    public final Object mo9448n0(LessonFont lessonFont, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo16480k = this.f17966d.mo16480k(lessonFont, interfaceC9968c);
        return objMo16480k == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo16480k : C9072e.f47360a;
    }
}

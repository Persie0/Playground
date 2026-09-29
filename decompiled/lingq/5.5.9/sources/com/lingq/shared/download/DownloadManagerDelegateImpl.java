package com.lingq.shared.download;

import ae.C0062b;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.support.v4.media.session.C0166e;
import ci.InterfaceC2019l;
import ci.InterfaceC2024q;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.downloader.Progress;
import com.lingq.shared.download.AbstractC3312a;
import com.lingq.shared.download.DownloadItem;
import com.lingq.shared.download.DownloadManagerDelegateImpl;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import dm.C5207g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ki.C6698d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7140u;
import mo.C7661i;
import no.C7828f;
import no.C7843k;
import no.InterfaceC7840j;
import no.InterfaceC7882z;
import p111f7.InterfaceC5474b;
import p111f7.InterfaceC5475c;
import p193j7.C6421a;
import p216k7.C6626a;
import p216k7.C6627b;
import p259m7.C7493a;
import p259m7.C7497e;
import p260m8.C7499b;
import p338qd.C8573r0;
import p349qo.C8656b;
import p416uh.InterfaceC9527a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadManagerDelegateImpl implements InterfaceC9527a {

    /* JADX INFO: renamed from: H */
    public final C7114a f17873H;

    /* JADX INFO: renamed from: I */
    public final C7138s f17874I;

    /* JADX INFO: renamed from: J */
    public final C7134o f17875J;

    /* JADX INFO: renamed from: K */
    public final AbstractChannel f17876K;

    /* JADX INFO: renamed from: L */
    public final LinkedHashMap f17877L;

    /* JADX INFO: renamed from: a */
    public final InterfaceC7882z f17878a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2019l f17879b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3324a f17880c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2024q f17881d;

    /* JADX INFO: renamed from: e */
    public Integer f17882e;

    /* JADX INFO: renamed from: f */
    public final File f17883f;

    /* JADX INFO: renamed from: g */
    public final File f17884g;

    /* JADX INFO: renamed from: h */
    public final AbstractChannel f17885h;

    /* JADX INFO: renamed from: i */
    public final C7114a f17886i;

    /* JADX INFO: renamed from: j */
    public final AbstractChannel f17887j;

    /* JADX INFO: renamed from: k */
    public final C7114a f17888k;

    /* JADX INFO: renamed from: l */
    public final AbstractChannel f17889l;

    /* JADX INFO: renamed from: com.lingq.shared.download.DownloadManagerDelegateImpl$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.shared.download.DownloadManagerDelegateImpl$1", m19206f = "DownloadManagerDelegate.kt", m19207l = {116}, m19208m = "invokeSuspend")
    public static final class C33051 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f17890e;

        /* JADX INFO: renamed from: com.lingq.shared.download.DownloadManagerDelegateImpl$1$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC7117d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DownloadManagerDelegateImpl f17892a;

            /* JADX INFO: renamed from: com.lingq.shared.download.DownloadManagerDelegateImpl$1$1$a */
            public static final class a implements InterfaceC5475c {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ DownloadManagerDelegateImpl f17893a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ DownloadItem f17894b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC7840j<Boolean> f17895c;

                public a(DownloadManagerDelegateImpl downloadManagerDelegateImpl, DownloadItem downloadItem, C7843k c7843k) {
                    this.f17893a = downloadManagerDelegateImpl;
                    this.f17894b = downloadItem;
                    this.f17895c = c7843k;
                }

                @Override // p111f7.InterfaceC5475c
                /* JADX INFO: renamed from: a */
                public final void mo9442a(Progress progress) {
                    long j10 = progress.f11366a;
                    long j11 = progress.f11367b;
                    int i10 = (int) ((j10 / j11) * 100);
                    boolean z10 = true;
                    if (1 > i10 || i10 >= 100) {
                        z10 = false;
                    }
                    DownloadItem downloadItem = this.f17894b;
                    DownloadManagerDelegateImpl downloadManagerDelegateImpl = this.f17893a;
                    if (z10 && j10 < j11) {
                        downloadManagerDelegateImpl.f17876K.mo16479j(new AbstractC3312a.c(i10, downloadItem));
                        return;
                    }
                    if (i10 == 100 || j10 >= j11) {
                        downloadManagerDelegateImpl.f17882e = null;
                        downloadManagerDelegateImpl.f17876K.mo16479j(new AbstractC3312a.a(downloadItem));
                        InterfaceC7840j<Boolean> interfaceC7840j = this.f17895c;
                        if (interfaceC7840j.mo15579b()) {
                            interfaceC7840j.mo2031y(Boolean.TRUE);
                        }
                    }
                }
            }

            /* JADX INFO: renamed from: com.lingq.shared.download.DownloadManagerDelegateImpl$1$1$b */
            public static final class b implements InterfaceC5474b {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ DownloadManagerDelegateImpl f17896a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ DownloadItem f17897b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ InterfaceC7840j<Boolean> f17898c;

                public b(DownloadManagerDelegateImpl downloadManagerDelegateImpl, DownloadItem downloadItem, C7843k c7843k) {
                    this.f17896a = downloadManagerDelegateImpl;
                    this.f17897b = downloadItem;
                    this.f17898c = c7843k;
                }

                @Override // p111f7.InterfaceC5474b
                /* JADX INFO: renamed from: a */
                public final void mo9443a() {
                    DownloadManagerDelegateImpl downloadManagerDelegateImpl = this.f17896a;
                    downloadManagerDelegateImpl.f17882e = null;
                    DownloadItem downloadItem = this.f17897b;
                    downloadManagerDelegateImpl.f17876K.mo16479j(new AbstractC3312a.b(downloadItem));
                    InterfaceC7840j<Boolean> interfaceC7840j = this.f17898c;
                    if (interfaceC7840j.mo15579b()) {
                        interfaceC7840j.mo2031y(C7499b.m14967u(new Exception("Error in download " + downloadItem.f17866b)));
                    }
                }

                @Override // p111f7.InterfaceC5474b
                /* JADX INFO: renamed from: b */
                public final void mo9444b() {
                    DownloadManagerDelegateImpl downloadManagerDelegateImpl = this.f17896a;
                    downloadManagerDelegateImpl.f17882e = null;
                    downloadManagerDelegateImpl.f17876K.mo16479j(new AbstractC3312a.a(this.f17897b));
                    InterfaceC7840j<Boolean> interfaceC7840j = this.f17898c;
                    if (interfaceC7840j.mo15579b()) {
                        interfaceC7840j.mo2031y(Boolean.TRUE);
                    }
                }
            }

            public AnonymousClass1(DownloadManagerDelegateImpl downloadManagerDelegateImpl) {
                this.f17892a = downloadManagerDelegateImpl;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x001b  */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlinx.coroutines.flow.InterfaceC7117d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1339r(DownloadItem downloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
                DownloadManagerDelegateImpl$1$1$emit$1 downloadManagerDelegateImpl$1$1$emit$1;
                Integer num;
                Integer num2;
                if (interfaceC9968c instanceof DownloadManagerDelegateImpl$1$1$emit$1) {
                    downloadManagerDelegateImpl$1$1$emit$1 = (DownloadManagerDelegateImpl$1$1$emit$1) interfaceC9968c;
                    int i10 = downloadManagerDelegateImpl$1$1$emit$1.f17901f;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        downloadManagerDelegateImpl$1$1$emit$1.f17901f = i10 - Integer.MIN_VALUE;
                    } else {
                        downloadManagerDelegateImpl$1$1$emit$1 = new DownloadManagerDelegateImpl$1$1$emit$1(this, interfaceC9968c);
                    }
                } else {
                    downloadManagerDelegateImpl$1$1$emit$1 = new DownloadManagerDelegateImpl$1$1$emit$1(this, interfaceC9968c);
                }
                Object obj = downloadManagerDelegateImpl$1$1$emit$1.f17899d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = downloadManagerDelegateImpl$1$1$emit$1.f17901f;
                try {
                    if (i11 == 0) {
                        C7499b.m14977z0(obj);
                        DownloadManagerDelegateImpl downloadManagerDelegateImpl = this.f17892a;
                        downloadManagerDelegateImpl$1$1$emit$1.getClass();
                        downloadManagerDelegateImpl$1$1$emit$1.getClass();
                        downloadManagerDelegateImpl$1$1$emit$1.f17901f = 1;
                        C7843k c7843k = new C7843k(1, C8656b.m16874A(downloadManagerDelegateImpl$1$1$emit$1));
                        c7843k.m15594r();
                        File file = new File(downloadManagerDelegateImpl.f17883f + "/" + downloadItem.f17866b + ".mp3");
                        boolean zExists = file.exists();
                        boolean z10 = downloadItem.f17868d;
                        int i12 = downloadItem.f17866b;
                        if (!(zExists && z10) && ((num = downloadManagerDelegateImpl.f17882e) == null || i12 != num.intValue())) {
                            downloadManagerDelegateImpl.f17882e = new Integer(i12);
                            C7497e c7497e = new C7497e(Uri.parse(C7076b.m14277B3(downloadItem.f17867c).toString()).toString(), downloadManagerDelegateImpl.f17883f.toString(), i12 + ".mp3");
                            c7497e.f41412e = String.valueOf(i12);
                            C7493a c7493a = new C7493a(c7497e);
                            c7493a.f41399m = new a(downloadManagerDelegateImpl, downloadItem, c7843k);
                            c7493a.m14891c(new b(downloadManagerDelegateImpl, downloadItem, c7843k));
                        } else if ((z10 && file.exists()) || ((num2 = downloadManagerDelegateImpl.f17882e) != null && i12 == num2.intValue())) {
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

        public C33051(InterfaceC9968c<? super C33051> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return DownloadManagerDelegateImpl.this.new C33051(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C33051) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f17890e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                DownloadManagerDelegateImpl downloadManagerDelegateImpl = DownloadManagerDelegateImpl.this;
                C7114a c7114a = downloadManagerDelegateImpl.f17886i;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(downloadManagerDelegateImpl);
                this.f17890e = 1;
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

    /* JADX INFO: renamed from: com.lingq.shared.download.DownloadManagerDelegateImpl$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.shared.download.DownloadManagerDelegateImpl$2", m19206f = "DownloadManagerDelegate.kt", m19207l = {183}, m19208m = "invokeSuspend")
    public static final class C33062 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f17902e;

        /* JADX INFO: renamed from: com.lingq.shared.download.DownloadManagerDelegateImpl$2$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC7117d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DownloadManagerDelegateImpl f17904a;

            /* JADX INFO: renamed from: com.lingq.shared.download.DownloadManagerDelegateImpl$2$1$a */
            public static final class a implements InterfaceC5475c {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ SentenceDownloadItem f17905a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ DownloadManagerDelegateImpl f17906b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f17907c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f17908d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ InterfaceC7840j<Boolean> f17909e;

                public a(DownloadManagerDelegateImpl downloadManagerDelegateImpl, SentenceDownloadItem sentenceDownloadItem, String str, String str2, C7843k c7843k) {
                    this.f17905a = sentenceDownloadItem;
                    this.f17906b = downloadManagerDelegateImpl;
                    this.f17907c = str;
                    this.f17908d = str2;
                    this.f17909e = c7843k;
                }

                @Override // p111f7.InterfaceC5475c
                /* JADX INFO: renamed from: a */
                public final void mo9442a(Progress progress) {
                    long j10 = progress.f11366a;
                    long j11 = progress.f11367b;
                    float f3 = 100;
                    if (((int) ((j10 / j11) * f3)) == 100 || j10 >= j11) {
                        SentenceDownloadItem sentenceDownloadItem = this.f17905a;
                        float f10 = sentenceDownloadItem.f17986e;
                        int i10 = sentenceDownloadItem.f17987f;
                        DownloadManagerDelegateImpl downloadManagerDelegateImpl = this.f17906b;
                        downloadManagerDelegateImpl.f17876K.mo16479j(new AbstractC3312a.c((int) ((f10 / i10) * f3), C8656b.m16904l(sentenceDownloadItem)));
                        if (sentenceDownloadItem.f17986e == i10) {
                            downloadManagerDelegateImpl.f17876K.mo16479j(new AbstractC3312a.a(C8656b.m16904l(sentenceDownloadItem), "", false));
                            downloadManagerDelegateImpl.f17874I.mo14371k(new AbstractC3312a.a(C8656b.m16904l(sentenceDownloadItem), this.f17907c, sentenceDownloadItem.f17988g));
                            C7828f.m15570d(downloadManagerDelegateImpl.f17878a, null, null, new DownloadManagerDelegateImpl$saveGeneratedSentences$1(sentenceDownloadItem.f17983b, downloadManagerDelegateImpl, this.f17908d, null), 3);
                        }
                        InterfaceC7840j<Boolean> interfaceC7840j = this.f17909e;
                        if (interfaceC7840j.mo15579b()) {
                            interfaceC7840j.mo2031y(Boolean.TRUE);
                        }
                    }
                }
            }

            /* JADX INFO: renamed from: com.lingq.shared.download.DownloadManagerDelegateImpl$2$1$b */
            public static final class b implements InterfaceC5474b {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ DownloadManagerDelegateImpl f17910a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ SentenceDownloadItem f17911b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f17912c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f17913d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ InterfaceC7840j<Boolean> f17914e;

                public b(DownloadManagerDelegateImpl downloadManagerDelegateImpl, SentenceDownloadItem sentenceDownloadItem, String str, String str2, C7843k c7843k) {
                    this.f17910a = downloadManagerDelegateImpl;
                    this.f17911b = sentenceDownloadItem;
                    this.f17912c = str;
                    this.f17913d = str2;
                    this.f17914e = c7843k;
                }

                @Override // p111f7.InterfaceC5474b
                /* JADX INFO: renamed from: a */
                public final void mo9443a() {
                    AbstractChannel abstractChannel = this.f17910a.f17876K;
                    SentenceDownloadItem sentenceDownloadItem = this.f17911b;
                    abstractChannel.mo16479j(new AbstractC3312a.b(C8656b.m16904l(sentenceDownloadItem)));
                    InterfaceC7840j<Boolean> interfaceC7840j = this.f17914e;
                    if (interfaceC7840j.mo15579b()) {
                        interfaceC7840j.mo2031y(C7499b.m14967u(new Exception("Error in download " + sentenceDownloadItem.f17983b)));
                    }
                }

                @Override // p111f7.InterfaceC5474b
                /* JADX INFO: renamed from: b */
                public final void mo9444b() {
                    DownloadManagerDelegateImpl downloadManagerDelegateImpl = this.f17910a;
                    SentenceDownloadItem sentenceDownloadItem = this.f17911b;
                    DownloadManagerDelegateImpl.m9440b(downloadManagerDelegateImpl, sentenceDownloadItem);
                    if (sentenceDownloadItem.f17986e == sentenceDownloadItem.f17987f) {
                        downloadManagerDelegateImpl.f17876K.mo16479j(new AbstractC3312a.a(C8656b.m16904l(sentenceDownloadItem), "", false));
                        downloadManagerDelegateImpl.f17874I.mo14371k(new AbstractC3312a.a(C8656b.m16904l(sentenceDownloadItem), this.f17912c, sentenceDownloadItem.f17988g));
                        C7828f.m15570d(downloadManagerDelegateImpl.f17878a, null, null, new DownloadManagerDelegateImpl$saveGeneratedSentences$1(sentenceDownloadItem.f17983b, downloadManagerDelegateImpl, this.f17913d, null), 3);
                    }
                    InterfaceC7840j<Boolean> interfaceC7840j = this.f17914e;
                    if (interfaceC7840j.mo15579b()) {
                        interfaceC7840j.mo2031y(Boolean.TRUE);
                    }
                }
            }

            public AnonymousClass1(DownloadManagerDelegateImpl downloadManagerDelegateImpl) {
                this.f17904a = downloadManagerDelegateImpl;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            @Override // kotlinx.coroutines.flow.InterfaceC7117d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1339r(SentenceDownloadItem sentenceDownloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
                DownloadManagerDelegateImpl$2$1$emit$1 downloadManagerDelegateImpl$2$1$emit$1;
                SentenceDownloadItem sentenceDownloadItem2;
                AnonymousClass1<T> anonymousClass1;
                if (interfaceC9968c instanceof DownloadManagerDelegateImpl$2$1$emit$1) {
                    downloadManagerDelegateImpl$2$1$emit$1 = (DownloadManagerDelegateImpl$2$1$emit$1) interfaceC9968c;
                    int i10 = downloadManagerDelegateImpl$2$1$emit$1.f17919h;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        downloadManagerDelegateImpl$2$1$emit$1.f17919h = i10 - Integer.MIN_VALUE;
                    } else {
                        downloadManagerDelegateImpl$2$1$emit$1 = new DownloadManagerDelegateImpl$2$1$emit$1(this, interfaceC9968c);
                    }
                } else {
                    downloadManagerDelegateImpl$2$1$emit$1 = new DownloadManagerDelegateImpl$2$1$emit$1(this, interfaceC9968c);
                }
                Object obj = downloadManagerDelegateImpl$2$1$emit$1.f17917f;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = downloadManagerDelegateImpl$2$1$emit$1.f17919h;
                try {
                    if (i11 == 0) {
                        C7499b.m14977z0(obj);
                        DownloadManagerDelegateImpl downloadManagerDelegateImpl = this.f17904a;
                        downloadManagerDelegateImpl$2$1$emit$1.f17915d = this;
                        downloadManagerDelegateImpl$2$1$emit$1.f17916e = sentenceDownloadItem;
                        downloadManagerDelegateImpl$2$1$emit$1.getClass();
                        downloadManagerDelegateImpl$2$1$emit$1.f17919h = 1;
                        C7843k c7843k = new C7843k(1, C8656b.m16874A(downloadManagerDelegateImpl$2$1$emit$1));
                        c7843k.m15594r();
                        File file = downloadManagerDelegateImpl.f17884g;
                        String strM16912t = C8656b.m16912t(sentenceDownloadItem);
                        int i12 = sentenceDownloadItem.f17983b;
                        String str = file + "/" + strM16912t;
                        File file2 = new File(str);
                        String str2 = sentenceDownloadItem.f17982a;
                        LinkedHashMap linkedHashMap = downloadManagerDelegateImpl.f17877L;
                        List arrayList = (List) linkedHashMap.get(new Integer(i12));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(sentenceDownloadItem);
                        linkedHashMap.put(new Integer(i12), arrayList);
                        boolean zExists = file2.exists();
                        String str3 = sentenceDownloadItem.f17984c;
                        if (zExists || !(!C7661i.m15250P2(str3))) {
                            boolean z10 = !C7661i.m15250P2(str3);
                            C7138s c7138s = downloadManagerDelegateImpl.f17874I;
                            AbstractChannel abstractChannel = downloadManagerDelegateImpl.f17876K;
                            boolean z11 = sentenceDownloadItem.f17988g;
                            if (z10) {
                                DownloadManagerDelegateImpl.m9440b(downloadManagerDelegateImpl, sentenceDownloadItem);
                                int i13 = sentenceDownloadItem.f17986e;
                                int i14 = sentenceDownloadItem.f17987f;
                                abstractChannel.mo16479j(new AbstractC3312a.c((int) ((i13 / i14) * 100), C8656b.m16904l(sentenceDownloadItem)));
                                if (i13 == i14) {
                                    abstractChannel.mo16479j(new AbstractC3312a.a(C8656b.m16904l(sentenceDownloadItem), "", false));
                                    c7138s.mo14371k(new AbstractC3312a.a(C8656b.m16904l(sentenceDownloadItem), str, z11));
                                    C7828f.m15570d(downloadManagerDelegateImpl.f17878a, null, null, new DownloadManagerDelegateImpl$saveGeneratedSentences$1(i12, downloadManagerDelegateImpl, str2, null), 3);
                                }
                                if (c7843k.mo15579b()) {
                                    c7843k.mo2031y(Boolean.TRUE);
                                }
                            } else {
                                abstractChannel.mo16479j(new AbstractC3312a.a(C8656b.m16904l(sentenceDownloadItem), "", false));
                                c7138s.mo14371k(new AbstractC3312a.a(C8656b.m16904l(sentenceDownloadItem), str, z11));
                                c7843k.mo2031y(Boolean.FALSE);
                            }
                        } else {
                            C7497e c7497e = new C7497e(Uri.parse(C7076b.m14277B3(str3).toString()).toString(), downloadManagerDelegateImpl.f17884g.toString(), C8656b.m16912t(sentenceDownloadItem));
                            c7497e.f41412e = C8656b.m16912t(sentenceDownloadItem);
                            C7493a c7493a = new C7493a(c7497e);
                            c7493a.f41399m = new a(downloadManagerDelegateImpl, sentenceDownloadItem, str, str2, c7843k);
                            c7493a.m14891c(new b(downloadManagerDelegateImpl, sentenceDownloadItem, str, str2, c7843k));
                        }
                        if (c7843k.m15593p() == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        sentenceDownloadItem2 = sentenceDownloadItem;
                        anonymousClass1 = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sentenceDownloadItem2 = downloadManagerDelegateImpl$2$1$emit$1.f17916e;
                        anonymousClass1 = downloadManagerDelegateImpl$2$1$emit$1.f17915d;
                        C7499b.m14977z0(obj);
                    }
                    if (sentenceDownloadItem2.f17986e == sentenceDownloadItem2.f17987f) {
                        DownloadManagerDelegateImpl.m9439a(anonymousClass1.f17904a, sentenceDownloadItem2.f17983b, sentenceDownloadItem2.f17982a);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                return C9072e.f47360a;
            }
        }

        public C33062(InterfaceC9968c<? super C33062> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return DownloadManagerDelegateImpl.this.new C33062(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C33062) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f17902e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                DownloadManagerDelegateImpl downloadManagerDelegateImpl = DownloadManagerDelegateImpl.this;
                C7114a c7114a = downloadManagerDelegateImpl.f17888k;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(downloadManagerDelegateImpl);
                this.f17902e = 1;
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

    /* JADX INFO: renamed from: com.lingq.shared.download.DownloadManagerDelegateImpl$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.shared.download.DownloadManagerDelegateImpl$3", m19206f = "DownloadManagerDelegate.kt", m19207l = {337}, m19208m = "invokeSuspend")
    public static final class C33073 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f17920e;

        /* JADX INFO: renamed from: com.lingq.shared.download.DownloadManagerDelegateImpl$3$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements InterfaceC7117d {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DownloadManagerDelegateImpl f17922a;

            public AnonymousClass1(DownloadManagerDelegateImpl downloadManagerDelegateImpl) {
                this.f17922a = downloadManagerDelegateImpl;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x001a  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlinx.coroutines.flow.InterfaceC7117d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo1339r(Pair<DownloadItem, Boolean> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
                DownloadManagerDelegateImpl$3$1$emit$1 downloadManagerDelegateImpl$3$1$emit$1;
                DownloadItem downloadItem;
                boolean zBooleanValue;
                AnonymousClass1<T> anonymousClass1;
                if (interfaceC9968c instanceof DownloadManagerDelegateImpl$3$1$emit$1) {
                    downloadManagerDelegateImpl$3$1$emit$1 = (DownloadManagerDelegateImpl$3$1$emit$1) interfaceC9968c;
                    int i10 = downloadManagerDelegateImpl$3$1$emit$1.f17928i;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        downloadManagerDelegateImpl$3$1$emit$1.f17928i = i10 - Integer.MIN_VALUE;
                    } else {
                        downloadManagerDelegateImpl$3$1$emit$1 = new DownloadManagerDelegateImpl$3$1$emit$1(this, interfaceC9968c);
                    }
                } else {
                    downloadManagerDelegateImpl$3$1$emit$1 = new DownloadManagerDelegateImpl$3$1$emit$1(this, interfaceC9968c);
                }
                DownloadManagerDelegateImpl$3$1$emit$1 downloadManagerDelegateImpl$3$1$emit$2 = downloadManagerDelegateImpl$3$1$emit$1;
                Object objMo9501W = downloadManagerDelegateImpl$3$1$emit$2.f17926g;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = downloadManagerDelegateImpl$3$1$emit$2.f17928i;
                if (i11 != 0) {
                    if (i11 == 1) {
                        zBooleanValue = downloadManagerDelegateImpl$3$1$emit$2.f17925f;
                        downloadItem = downloadManagerDelegateImpl$3$1$emit$2.f17924e;
                        anonymousClass1 = downloadManagerDelegateImpl$3$1$emit$2.f17923d;
                        C7499b.m14977z0(objMo9501W);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(objMo9501W);
                    }
                    return C9072e.f47360a;
                }
                C7499b.m14977z0(objMo9501W);
                downloadItem = pair.f38012a;
                zBooleanValue = pair.f38013b.booleanValue();
                InterfaceC3324a interfaceC3324a = this.f17922a.f17880c;
                String str = downloadItem.f17865a;
                downloadManagerDelegateImpl$3$1$emit$2.f17923d = this;
                downloadManagerDelegateImpl$3$1$emit$2.f17924e = downloadItem;
                downloadManagerDelegateImpl$3$1$emit$2.f17925f = zBooleanValue;
                downloadManagerDelegateImpl$3$1$emit$2.f17928i = 1;
                objMo9501W = interfaceC3324a.mo9501W(downloadItem.f17866b, str, downloadManagerDelegateImpl$3$1$emit$2);
                if (objMo9501W == coroutineSingletons) {
                    return coroutineSingletons;
                }
                anonymousClass1 = this;
                boolean z10 = zBooleanValue;
                List<LessonStudyTranslationSentence> list = (List) objMo9501W;
                if (!(!list.isEmpty())) {
                    return C9072e.f47360a;
                }
                DownloadManagerDelegateImpl downloadManagerDelegateImpl = anonymousClass1.f17922a;
                String str2 = downloadItem.f17865a;
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                for (LessonStudyTranslationSentence lessonStudyTranslationSentence : list) {
                    arrayList.add(new Pair(lessonStudyTranslationSentence.f21899e, new Integer(lessonStudyTranslationSentence.f21895a)));
                }
                int i12 = downloadItem.f17866b;
                downloadManagerDelegateImpl$3$1$emit$2.f17923d = null;
                downloadManagerDelegateImpl$3$1$emit$2.f17924e = null;
                downloadManagerDelegateImpl$3$1$emit$2.f17928i = 2;
                if (downloadManagerDelegateImpl.mo9407X1(str2, arrayList, i12, z10, downloadManagerDelegateImpl$3$1$emit$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            }
        }

        public C33073(InterfaceC9968c<? super C33073> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return DownloadManagerDelegateImpl.this.new C33073(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C33073) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f17920e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                DownloadManagerDelegateImpl downloadManagerDelegateImpl = DownloadManagerDelegateImpl.this;
                C7114a c7114a = downloadManagerDelegateImpl.f17873H;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(downloadManagerDelegateImpl);
                this.f17920e = 1;
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

    /* JADX INFO: renamed from: com.lingq.shared.download.DownloadManagerDelegateImpl$4 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.shared.download.DownloadManagerDelegateImpl$4", m19206f = "DownloadManagerDelegate.kt", m19207l = {354}, m19208m = "invokeSuspend")
    public static final class C33084 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f17929e;

        /* JADX INFO: renamed from: com.lingq.shared.download.DownloadManagerDelegateImpl$4$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/download/a;", "Lcom/lingq/shared/download/DownloadItem;", "state", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.shared.download.DownloadManagerDelegateImpl$4$1", m19206f = "DownloadManagerDelegate.kt", m19207l = {357, 365, 374, 379}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<AbstractC3312a<? extends DownloadItem>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public DownloadItem f17931e;

            /* JADX INFO: renamed from: f */
            public int f17932f;

            /* JADX INFO: renamed from: g */
            public /* synthetic */ Object f17933g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ DownloadManagerDelegateImpl f17934h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DownloadManagerDelegateImpl downloadManagerDelegateImpl, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f17934h = downloadManagerDelegateImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f17934h, interfaceC9968c);
                anonymousClass1.f17933g = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(AbstractC3312a<? extends DownloadItem> abstractC3312a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(abstractC3312a, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Code duplicated, block: B:33:0x0098  */
            /* JADX WARN: Code duplicated, block: B:35:0x00b3 A[RETURN] */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                DownloadItem downloadItem;
                AbstractC3312a abstractC3312a;
                C6698d c6698d;
                InterfaceC2019l interfaceC2019l;
                String str;
                int i10;
                int i11;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.f17932f;
                DownloadManagerDelegateImpl downloadManagerDelegateImpl = this.f17934h;
                if (i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        if (i12 == 3) {
                            downloadItem = this.f17931e;
                            abstractC3312a = (AbstractC3312a) this.f17933g;
                            C7499b.m14977z0(obj);
                            c6698d = (C6698d) obj;
                            if (c6698d != null || !c6698d.f37876b) {
                                interfaceC2019l = downloadManagerDelegateImpl.f17879b;
                                str = downloadItem.f17865a;
                                i10 = downloadItem.f17866b;
                                i11 = ((AbstractC3312a.c) abstractC3312a).f18001b;
                                this.f17933g = null;
                                this.f17931e = null;
                                this.f17932f = 4;
                                if (interfaceC2019l.mo6129x(i10, i11, str, this, false) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        } else if (i12 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    C7499b.m14977z0(obj);
                } else {
                    C7499b.m14977z0(obj);
                    AbstractC3312a abstractC3312a2 = (AbstractC3312a) this.f17933g;
                    if (abstractC3312a2 instanceof AbstractC3312a.a) {
                        InterfaceC2019l interfaceC2019l2 = downloadManagerDelegateImpl.f17879b;
                        DownloadItem downloadItem2 = (DownloadItem) ((AbstractC3312a.a) abstractC3312a2).f17996a;
                        String str2 = downloadItem2.f17865a;
                        int i13 = downloadItem2.f17866b;
                        this.f17932f = 1;
                        if (interfaceC2019l2.mo6129x(i13, 100, str2, this, true) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (abstractC3312a2 instanceof AbstractC3312a.b) {
                        InterfaceC2019l interfaceC2019l3 = downloadManagerDelegateImpl.f17879b;
                        DownloadItem downloadItem3 = (DownloadItem) ((AbstractC3312a.b) abstractC3312a2).f17999a;
                        String str3 = downloadItem3.f17865a;
                        int i14 = downloadItem3.f17866b;
                        this.f17932f = 2;
                        if (interfaceC2019l3.mo6129x(i14, 0, str3, this, false) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (abstractC3312a2 instanceof AbstractC3312a.c) {
                        downloadItem = (DownloadItem) ((AbstractC3312a.c) abstractC3312a2).f18000a;
                        InterfaceC2019l interfaceC2019l4 = downloadManagerDelegateImpl.f17879b;
                        String str4 = downloadItem.f17865a;
                        this.f17933g = abstractC3312a2;
                        this.f17931e = downloadItem;
                        this.f17932f = 3;
                        Object objMo6112g = interfaceC2019l4.mo6112g(downloadItem.f17866b, str4, this);
                        if (objMo6112g == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        abstractC3312a = abstractC3312a2;
                        obj = objMo6112g;
                        c6698d = (C6698d) obj;
                        if (c6698d != null) {
                            interfaceC2019l = downloadManagerDelegateImpl.f17879b;
                            str = downloadItem.f17865a;
                            i10 = downloadItem.f17866b;
                            i11 = ((AbstractC3312a.c) abstractC3312a).f18001b;
                            this.f17933g = null;
                            this.f17931e = null;
                            this.f17932f = 4;
                            if (interfaceC2019l.mo6129x(i10, i11, str, this, false) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            interfaceC2019l = downloadManagerDelegateImpl.f17879b;
                            str = downloadItem.f17865a;
                            i10 = downloadItem.f17866b;
                            i11 = ((AbstractC3312a.c) abstractC3312a).f18001b;
                            this.f17933g = null;
                            this.f17931e = null;
                            this.f17932f = 4;
                            if (interfaceC2019l.mo6129x(i10, i11, str, this, false) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                }
                return C9072e.f47360a;
            }
        }

        public C33084(InterfaceC9968c<? super C33084> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return DownloadManagerDelegateImpl.this.new C33084(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C33084) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f17929e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                DownloadManagerDelegateImpl downloadManagerDelegateImpl = DownloadManagerDelegateImpl.this;
                C7114a c7114aM287L1 = C0062b.m287L1(downloadManagerDelegateImpl.f17876K);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(downloadManagerDelegateImpl, null);
                this.f17929e = 1;
                if (C0062b.m369m0(c7114aM287L1, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.shared.download.DownloadManagerDelegateImpl$a */
    public static final class C3309a implements InterfaceC5474b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DownloadItem f17936b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f17937c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f17938d;

        public C3309a(DownloadItem downloadItem, String str, boolean z10) {
            this.f17936b = downloadItem;
            this.f17937c = str;
            this.f17938d = z10;
        }

        @Override // p111f7.InterfaceC5474b
        /* JADX INFO: renamed from: a */
        public final void mo9443a() {
            DownloadManagerDelegateImpl downloadManagerDelegateImpl = DownloadManagerDelegateImpl.this;
            downloadManagerDelegateImpl.f17882e = null;
            downloadManagerDelegateImpl.f17876K.mo16479j(new AbstractC3312a.b(this.f17936b));
        }

        @Override // p111f7.InterfaceC5474b
        /* JADX INFO: renamed from: b */
        public final void mo9444b() {
            DownloadManagerDelegateImpl downloadManagerDelegateImpl = DownloadManagerDelegateImpl.this;
            downloadManagerDelegateImpl.f17882e = null;
            DownloadItem downloadItem = this.f17936b;
            downloadManagerDelegateImpl.f17876K.mo16479j(new AbstractC3312a.a(downloadItem));
            downloadManagerDelegateImpl.f17874I.mo14371k(new AbstractC3312a.a(downloadItem, this.f17937c, this.f17938d));
        }
    }

    public DownloadManagerDelegateImpl(Context context, InterfaceC7882z interfaceC7882z, InterfaceC2019l interfaceC2019l, InterfaceC3324a interfaceC3324a, InterfaceC2024q interfaceC2024q) {
        C5207g.m11111f(interfaceC7882z, "coroutineScope");
        C5207g.m11111f(interfaceC2019l, "playlistRepository");
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC2024q, "ttsRepository");
        this.f17878a = interfaceC7882z;
        this.f17879b = interfaceC2019l;
        this.f17880c = interfaceC3324a;
        this.f17881d = interfaceC2024q;
        this.f17883f = new File(C0166e.m765k(context.getFilesDir().toString(), "/tracks/"));
        this.f17884g = new File(C0166e.m765k(context.getFilesDir().toString(), "/tts/"));
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        AbstractChannel abstractChannelM16738m = C8573r0.m16738m(1, bufferOverflow, 4);
        this.f17885h = abstractChannelM16738m;
        this.f17886i = C0062b.m287L1(abstractChannelM16738m);
        AbstractChannel abstractChannelM16738m2 = C8573r0.m16738m(1, bufferOverflow, 4);
        this.f17887j = abstractChannelM16738m2;
        this.f17888k = C0062b.m287L1(abstractChannelM16738m2);
        AbstractChannel abstractChannelM16738m3 = C8573r0.m16738m(1, bufferOverflow, 4);
        this.f17889l = abstractChannelM16738m3;
        this.f17873H = C0062b.m287L1(abstractChannelM16738m3);
        C7138s c7138sM372n = C0062b.m372n(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.f17874I = c7138sM372n;
        this.f17875J = C0062b.m341d2(c7138sM372n, interfaceC7882z, InterfaceC7140u.a.f40388b);
        this.f17876K = C8573r0.m16738m(-1, null, 6);
        this.f17877L = new LinkedHashMap();
        C6421a c6421a = new C6421a();
        C6626a c6626a = C6626a.f37566f;
        c6626a.getClass();
        c6626a.f37567a = 30000;
        c6626a.f37568b = 30000;
        c6626a.f37569c = "PRDownloader";
        c6626a.f37570d = c6421a;
        c6626a.f37571e = new C8573r0();
        C6627b.m13257b();
        C7828f.m15570d(interfaceC7882z, null, null, new C33051(null), 3);
        C7828f.m15570d(interfaceC7882z, null, null, new C33062(null), 3);
        C7828f.m15570d(interfaceC7882z, null, null, new C33073(null), 3);
        C7828f.m15570d(interfaceC7882z, null, null, new C33084(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0135 A[Catch: IOException -> 0x0131, TRY_LEAVE, TryCatch #5 {IOException -> 0x0131, blocks: (B:65:0x012a, B:69:0x0135), top: B:76:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:76:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m9439a(DownloadManagerDelegateImpl downloadManagerDelegateImpl, int i10, String str) throws Throwable {
        FileInputStream fileInputStream;
        File file = downloadManagerDelegateImpl.f17883f;
        String str2 = file + "/" + i10 + ".mp3";
        File file2 = new File(str2);
        if (file2.exists()) {
            return;
        }
        if (!file.exists()) {
            file.mkdir();
        }
        ArrayList<File> arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = downloadManagerDelegateImpl.f17877L;
        List list = (List) linkedHashMap.get(Integer.valueOf(i10));
        if (list != null) {
            ArrayList<SentenceDownloadItem> arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((SentenceDownloadItem) obj).f17989h > 0.0d) {
                    arrayList2.add(obj);
                }
            }
            for (SentenceDownloadItem sentenceDownloadItem : arrayList2) {
                arrayList.add(new File(downloadManagerDelegateImpl.f17884g + "/" + C8656b.m16912t(sentenceDownloadItem)));
            }
        }
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream2 = null;
        FileInputStream fileInputStream3 = null;
        fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    FileInputStream fileInputStream4 = new FileInputStream(file2);
                    try {
                        for (File file3 : arrayList) {
                            if (file3.exists()) {
                                FileInputStream fileInputStream5 = new FileInputStream(file3);
                                SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream4, fileInputStream5);
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    try {
                                        int i11 = fileInputStream5.read(bArr);
                                        if (i11 == -1) {
                                            break;
                                        } else {
                                            fileOutputStream2.write(bArr, 0, i11);
                                        }
                                    } catch (Throwable th2) {
                                        fileInputStream5.close();
                                        sequenceInputStream.close();
                                        throw th2;
                                    }
                                    e = e;
                                    fileInputStream2 = fileInputStream4;
                                    fileInputStream = fileInputStream2;
                                    fileOutputStream = fileOutputStream2;
                                    try {
                                        e.printStackTrace();
                                        if (fileOutputStream != null) {
                                            fileOutputStream.flush();
                                            fileOutputStream.close();
                                        }
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                        linkedHashMap.remove(Integer.valueOf(i10));
                                        downloadManagerDelegateImpl.f17880c.mo9488J(str, i10, str2);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.flush();
                                                fileOutputStream.close();
                                                if (fileInputStream != null) {
                                                    fileInputStream.close();
                                                }
                                            } catch (IOException e10) {
                                                e10.printStackTrace();
                                                throw th;
                                            }
                                        } else if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                        throw th;
                                    }
                                }
                                fileInputStream5.close();
                                sequenceInputStream.close();
                            }
                        }
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        fileInputStream4.close();
                    } catch (IOException e11) {
                        e = e11;
                        fileInputStream2 = fileInputStream4;
                    } catch (Throwable th4) {
                        th = th4;
                        fileInputStream3 = fileInputStream4;
                        fileInputStream = fileInputStream3;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                        } else if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                } catch (IOException e12) {
                    e = e12;
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e13) {
                e13.printStackTrace();
            }
        } catch (IOException e14) {
            e = e14;
            fileInputStream = null;
        } catch (Throwable th6) {
            th = th6;
            fileInputStream = null;
        }
        linkedHashMap.remove(Integer.valueOf(i10));
        downloadManagerDelegateImpl.f17880c.mo9488J(str, i10, str2);
    }

    /* JADX INFO: renamed from: b */
    public static final void m9440b(DownloadManagerDelegateImpl downloadManagerDelegateImpl, SentenceDownloadItem sentenceDownloadItem) {
        downloadManagerDelegateImpl.getClass();
        try {
            String str = downloadManagerDelegateImpl.f17884g + "/" + C8656b.m16912t(sentenceDownloadItem);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            mediaMetadataRetriever.release();
            sentenceDownloadItem.f17989h = (strExtractMetadata != null ? Long.parseLong(strExtractMetadata) : 0L) / 1000.0d;
        } catch (Exception unused) {
        }
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: A0 */
    public final void mo9391A0(int i10) {
        File file = new File(this.f17883f + "/" + i10 + ".mp3");
        if (file.exists()) {
            file.delete();
        }
        C7499b.m14942h(String.valueOf(i10));
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: S1 */
    public final Object mo9405S1(DownloadItem downloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo16480k = this.f17885h.mo16480k(downloadItem, interfaceC9968c);
        return objMo16480k == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo16480k : C9072e.f47360a;
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: X0 */
    public final void mo9406X0(final DownloadItem downloadItem, final boolean z10) {
        String str = downloadItem.f17867c;
        if (C7661i.m15250P2(str)) {
            this.f17889l.mo16479j(new Pair(downloadItem, Boolean.valueOf(z10)));
            return;
        }
        File file = this.f17883f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file);
        sb2.append("/");
        int i10 = downloadItem.f17866b;
        final String strM768o = C0166e.m768o(sb2, i10, ".mp3");
        if (new File(strM768o).exists() && downloadItem.f17868d) {
            this.f17874I.mo14371k(new AbstractC3312a.a(downloadItem, strM768o, z10));
            return;
        }
        C7499b.m14942h(String.valueOf(i10));
        C7497e c7497e = new C7497e(Uri.parse(C7076b.m14277B3(str).toString()).toString(), file.toString(), i10 + ".mp3");
        c7497e.f41412e = String.valueOf(i10);
        C7493a c7493a = new C7493a(c7497e);
        c7493a.f41399m = new InterfaceC5475c() { // from class: uh.b
            @Override // p111f7.InterfaceC5475c
            /* JADX INFO: renamed from: a */
            public final void mo9442a(Progress progress) {
                DownloadManagerDelegateImpl downloadManagerDelegateImpl = this.f49061a;
                C5207g.m11111f(downloadManagerDelegateImpl, "this$0");
                DownloadItem downloadItem2 = downloadItem;
                C5207g.m11111f(downloadItem2, "$downloadItem");
                String str2 = strM768o;
                C5207g.m11111f(str2, "$fileName");
                long j10 = progress.f11366a;
                long j11 = progress.f11367b;
                int i11 = (int) ((j10 / j11) * 100);
                boolean z11 = true;
                if (1 > i11 || i11 >= 100) {
                    z11 = false;
                }
                C7138s c7138s = downloadManagerDelegateImpl.f17874I;
                AbstractChannel abstractChannel = downloadManagerDelegateImpl.f17876K;
                if (z11 && j10 < j11) {
                    c7138s.mo14371k(new AbstractC3312a.c(i11, downloadItem2));
                    abstractChannel.mo16479j(new AbstractC3312a.c(i11, downloadItem2));
                } else if (i11 == 100 || j10 >= j11) {
                    downloadManagerDelegateImpl.f17882e = null;
                    abstractChannel.mo16479j(new AbstractC3312a.a(downloadItem2, "", false));
                    c7138s.mo14371k(new AbstractC3312a.a(downloadItem2, str2, z10));
                }
            }
        };
        c7493a.m14891c(new C3309a(downloadItem, strM768o, z10));
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: X1 */
    public final Object mo9407X1(String str, List<Pair<String, Integer>> list, int i10, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        C7828f.m15570d(this.f17878a, null, null, new DownloadManagerDelegateImpl$fetchTTSForSentences$2(this, i10, str, z10, list, null), 3);
        return C9072e.f47360a;
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: a2 */
    public final InterfaceC7137r<AbstractC3312a<DownloadItem>> mo9409a2() {
        return this.f17875J;
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: i1 */
    public final void mo9412i1(ArrayList arrayList, String str) {
        C5207g.m11111f(str, "language");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7499b.m14942h(String.valueOf(((Number) it.next()).intValue()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C7828f.m15570d(this.f17878a, null, null, new DownloadManagerDelegateImpl$cancelAllDownloadsFor$2$1(((Number) it2.next()).intValue(), this, str, null), 3);
        }
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: x0 */
    public final Object mo9422x0(DownloadItem downloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo16480k = this.f17889l.mo16480k(new Pair(downloadItem, Boolean.FALSE), interfaceC9968c);
        return objMo16480k == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo16480k : C9072e.f47360a;
    }
}

package com.lingq.commons.controllers;

import ae.C0062b;
import android.content.Context;
import android.net.Uri;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.speech.tts.Voice;
import android.support.v4.media.session.C0166e;
import ci.InterfaceC2024q;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.C2505u;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.drm.C2397a;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.InterfaceC2399c;
import com.google.android.exoplayer2.source.C2497n;
import com.google.android.exoplayer2.upstream.C2527a;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$7;
import com.lingq.shared.uimodel.LocalTextToSpeechVoice;
import com.lingq.shared.uimodel.TextToSpeechAppVoice;
import com.lingq.util.C4924a;
import com.linguist.R;
import com.tonyodev.fetch2.fetch.FetchImpl;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jm.C6526i;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.C7076b;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.C7848l1;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import p076di.InterfaceC5179a;
import p118fe.C5509a;
import p155he.C6041e;
import p244lh.C7372i;
import p260m8.C7499b;
import p261m9.C7505f;
import p338qd.C8573r0;
import p385sf.C9000b;
import p454wa.C9884i;
import p454wa.InterfaceC9882g;
import p463wk.InterfaceC9958a;
import p464wl.InterfaceC9968c;
import p479xa.C10134c0;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class TtsControllerImpl implements InterfaceC3275c, TextToSpeech.OnInitListener {

    /* JADX INFO: renamed from: H */
    public C7848l1 f16565H;

    /* JADX INFO: renamed from: I */
    public InterfaceC7875v0 f16566I;

    /* JADX INFO: renamed from: J */
    public String f16567J;

    /* JADX INFO: renamed from: K */
    public String f16568K;

    /* JADX INFO: renamed from: L */
    public boolean f16569L;

    /* JADX INFO: renamed from: a */
    public final Context f16570a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7882z f16571b;

    /* JADX INFO: renamed from: c */
    public final CoroutineDispatcher f16572c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2024q f16573d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5179a f16574e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC9958a f16575f;

    /* JADX INFO: renamed from: g */
    public final C2413j f16576g;

    /* JADX INFO: renamed from: h */
    public final TextToSpeech f16577h;

    /* JADX INFO: renamed from: i */
    public final AbstractChannel f16578i;

    /* JADX INFO: renamed from: j */
    public final C7114a f16579j;

    /* JADX INFO: renamed from: k */
    public final AbstractChannel f16580k;

    /* JADX INFO: renamed from: l */
    public final C7114a f16581l;

    /* JADX INFO: renamed from: com.lingq.commons.controllers.TtsControllerImpl$a */
    public static final class C3267a extends UtteranceProgressListener {
        public C3267a() {
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public final void onDone(String str) {
            TtsControllerImpl.this.f16569L = false;
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public final void onError(String str) {
            TtsControllerImpl.this.f16569L = false;
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public final void onStart(String str) {
        }
    }

    /* JADX INFO: renamed from: com.lingq.commons.controllers.TtsControllerImpl$b */
    public static final class C3268b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C7499b.m14951m(((Voice) t10).getName(), ((Voice) t11).getName());
        }
    }

    public TtsControllerImpl(Context context, InterfaceC7882z interfaceC7882z, CoroutineDispatcher coroutineDispatcher, ExecutorC7177a executorC7177a, InterfaceC2024q interfaceC2024q, InterfaceC5179a interfaceC5179a, FetchImpl fetchImpl) {
        C5207g.m11111f(interfaceC7882z, "coroutineScope");
        C5207g.m11111f(interfaceC2024q, "ttsRepository");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        this.f16570a = context;
        this.f16571b = interfaceC7882z;
        this.f16572c = coroutineDispatcher;
        this.f16573d = interfaceC2024q;
        this.f16574e = interfaceC5179a;
        this.f16575f = fetchImpl;
        C2413j c2413jM6769a = new ExoPlayer.C2348c(context).m6769a();
        this.f16576g = c2413jM6769a;
        AbstractChannel abstractChannelM16738m = C8573r0.m16738m(-1, null, 6);
        this.f16578i = abstractChannelM16738m;
        this.f16579j = C0062b.m287L1(abstractChannelM16738m);
        AbstractChannel abstractChannelM16738m2 = C8573r0.m16738m(-1, null, 6);
        this.f16580k = abstractChannelM16738m2;
        this.f16581l = C0062b.m287L1(abstractChannelM16738m2);
        this.f16567J = "";
        this.f16568K = "";
        c2413jM6769a.addListener(new C7372i(this));
        c2413jM6769a.setPlaybackParameters(new C2505u(1.0f, 1.0f));
        this.f16577h = new TextToSpeech(context, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final Object m9331a(TtsControllerImpl ttsControllerImpl, String str, String str2, TextToSpeechAppVoice textToSpeechAppVoice, float f3, InterfaceC9968c interfaceC9968c) throws Throwable {
        TtsControllerImpl$fetchUtterance$1 ttsControllerImpl$fetchUtterance$1;
        TtsControllerImpl ttsControllerImpl2 = ttsControllerImpl;
        ttsControllerImpl2.getClass();
        if (interfaceC9968c instanceof TtsControllerImpl$fetchUtterance$1) {
            ttsControllerImpl$fetchUtterance$1 = (TtsControllerImpl$fetchUtterance$1) interfaceC9968c;
            int i10 = ttsControllerImpl$fetchUtterance$1.f16596j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ttsControllerImpl$fetchUtterance$1.f16596j = i10 - Integer.MIN_VALUE;
            } else {
                ttsControllerImpl$fetchUtterance$1 = new TtsControllerImpl$fetchUtterance$1(ttsControllerImpl2, interfaceC9968c);
            }
        } else {
            ttsControllerImpl$fetchUtterance$1 = new TtsControllerImpl$fetchUtterance$1(ttsControllerImpl2, interfaceC9968c);
        }
        Object objMo6172c = ttsControllerImpl$fetchUtterance$1.f16594h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = ttsControllerImpl$fetchUtterance$1.f16596j;
        if (i11 != 0) {
            if (i11 == 1) {
                f3 = ttsControllerImpl$fetchUtterance$1.f16593g;
                str2 = ttsControllerImpl$fetchUtterance$1.f16592f;
                str = ttsControllerImpl$fetchUtterance$1.f16591e;
                ttsControllerImpl2 = ttsControllerImpl$fetchUtterance$1.f16590d;
                C7499b.m14977z0(objMo6172c);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo6172c);
            }
        }
        C7499b.m14977z0(objMo6172c);
        ttsControllerImpl$fetchUtterance$1.f16590d = ttsControllerImpl2;
        ttsControllerImpl$fetchUtterance$1.f16591e = str;
        ttsControllerImpl$fetchUtterance$1.f16592f = str2;
        ttsControllerImpl$fetchUtterance$1.f16593g = f3;
        ttsControllerImpl$fetchUtterance$1.f16596j = 1;
        objMo6172c = ttsControllerImpl2.f16573d.mo6172c(str, str2, textToSpeechAppVoice);
        if (objMo6172c == coroutineSingletons) {
            return coroutineSingletons;
        }
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1((InterfaceC7116c) objMo6172c, new TtsControllerImpl$fetchUtterance$2(ttsControllerImpl2, str, str2, null));
        C3276d c3276d = new C3276d(ttsControllerImpl2, str, str2, f3);
        ttsControllerImpl$fetchUtterance$1.f16590d = null;
        ttsControllerImpl$fetchUtterance$1.f16591e = null;
        ttsControllerImpl$fetchUtterance$1.f16592f = null;
        ttsControllerImpl$fetchUtterance$1.f16596j = 2;
        return flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.mo9539a(c3276d, ttsControllerImpl$fetchUtterance$1) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX INFO: renamed from: b */
    public static final Object m9332b(TtsControllerImpl ttsControllerImpl, Uri uri, boolean z10, float f3, InterfaceC9968c interfaceC9968c) throws Throwable {
        TtsControllerImpl$play$1 ttsControllerImpl$play$1;
        InterfaceC2399c interfaceC2399c;
        DefaultDrmSessionManager defaultDrmSessionManagerM6959b;
        ttsControllerImpl.getClass();
        if (interfaceC9968c instanceof TtsControllerImpl$play$1) {
            ttsControllerImpl$play$1 = (TtsControllerImpl$play$1) interfaceC9968c;
            int i10 = ttsControllerImpl$play$1.f16618f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ttsControllerImpl$play$1.f16618f = i10 - Integer.MIN_VALUE;
            } else {
                ttsControllerImpl$play$1 = new TtsControllerImpl$play$1(ttsControllerImpl, interfaceC9968c);
            }
        } else {
            ttsControllerImpl$play$1 = new TtsControllerImpl$play$1(ttsControllerImpl, interfaceC9968c);
        }
        TtsControllerImpl$play$1 ttsControllerImpl$play$2 = ttsControllerImpl$play$1;
        Object obj = ttsControllerImpl$play$2.f16616d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = ttsControllerImpl$play$2.f16618f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                C9884i c9884i = new C9884i(uri);
                final FileDataSource fileDataSource = new FileDataSource();
                fileDataSource.mo7273e(c9884i);
                InterfaceC9882g.a aVar = new InterfaceC9882g.a() { // from class: lh.g
                    @Override // p454wa.InterfaceC9882g.a
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9882g mo14771a() {
                        FileDataSource fileDataSource2 = fileDataSource;
                        C5207g.m11111f(fileDataSource2, "$fileDataSource");
                        return fileDataSource2;
                    }
                };
                C2466p c2466p = C2466p.f12765g;
                C2466p.a aVar2 = new C2466p.a();
                aVar2.f12778b = uri;
                C2466p c2466pM7213a = aVar2.m7213a();
                C7505f c7505f = new C7505f();
                synchronized (c7505f) {
                    c7505f.f41485b = 4;
                }
                synchronized (c7505f) {
                    c7505f.f41484a = false;
                }
                C5509a c5509a = new C5509a(6, c7505f);
                Object obj2 = new Object();
                C2527a c2527a = new C2527a();
                c2466pM7213a.f12772b.getClass();
                c2466pM7213a.f12772b.getClass();
                C2466p.d dVar = c2466pM7213a.f12772b.f12842c;
                if (dVar == null || C10134c0.f51354a < 18) {
                    interfaceC2399c = InterfaceC2399c.f12205a;
                } else {
                    synchronized (obj2) {
                        defaultDrmSessionManagerM6959b = C10134c0.m19034a(dVar, null) ? null : C2397a.m6959b(dVar);
                        defaultDrmSessionManagerM6959b.getClass();
                    }
                    interfaceC2399c = defaultDrmSessionManagerM6959b;
                }
                C2497n c2497n = new C2497n(c2466pM7213a, aVar, c5509a, interfaceC2399c, c2527a, 1048576);
                CoroutineDispatcher coroutineDispatcher = ttsControllerImpl.f16572c;
                TtsControllerImpl$play$2 ttsControllerImpl$play$3 = new TtsControllerImpl$play$2(ttsControllerImpl, f3, c2466pM7213a, z10, c2497n, null);
                ttsControllerImpl$play$2.f16618f = 1;
                if (C7828f.m15574h(ttsControllerImpl$play$2, coroutineDispatcher, ttsControllerImpl$play$3) == coroutineSingletons) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX INFO: renamed from: d */
    public static final Object m9333d(TtsControllerImpl ttsControllerImpl, Uri uri, double d10, Double d11, float f3, InterfaceC9968c interfaceC9968c) throws Throwable {
        TtsControllerImpl$playClipped$1 ttsControllerImpl$playClipped$1;
        InterfaceC2399c interfaceC2399c;
        DefaultDrmSessionManager defaultDrmSessionManagerM6959b;
        ttsControllerImpl.getClass();
        if (interfaceC9968c instanceof TtsControllerImpl$playClipped$1) {
            ttsControllerImpl$playClipped$1 = (TtsControllerImpl$playClipped$1) interfaceC9968c;
            int i10 = ttsControllerImpl$playClipped$1.f16626f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ttsControllerImpl$playClipped$1.f16626f = i10 - Integer.MIN_VALUE;
            } else {
                ttsControllerImpl$playClipped$1 = new TtsControllerImpl$playClipped$1(ttsControllerImpl, interfaceC9968c);
            }
        } else {
            ttsControllerImpl$playClipped$1 = new TtsControllerImpl$playClipped$1(ttsControllerImpl, interfaceC9968c);
        }
        TtsControllerImpl$playClipped$1 ttsControllerImpl$playClipped$2 = ttsControllerImpl$playClipped$1;
        Object obj = ttsControllerImpl$playClipped$2.f16624d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = ttsControllerImpl$playClipped$2.f16626f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                C9884i c9884i = new C9884i(uri);
                final FileDataSource fileDataSource = new FileDataSource();
                fileDataSource.mo7273e(c9884i);
                InterfaceC9882g.a aVar = new InterfaceC9882g.a() { // from class: lh.f
                    @Override // p454wa.InterfaceC9882g.a
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9882g mo14771a() {
                        FileDataSource fileDataSource2 = fileDataSource;
                        C5207g.m11111f(fileDataSource2, "$fileDataSource");
                        return fileDataSource2;
                    }
                };
                C2466p c2466p = C2466p.f12765g;
                C2466p.a aVar2 = new C2466p.a();
                aVar2.f12778b = uri;
                C2466p c2466pM7213a = aVar2.m7213a();
                C7505f c7505f = new C7505f();
                synchronized (c7505f) {
                    c7505f.f41485b = 4;
                }
                synchronized (c7505f) {
                    c7505f.f41484a = false;
                }
                C5509a c5509a = new C5509a(6, c7505f);
                Object obj2 = new Object();
                C2527a c2527a = new C2527a();
                c2466pM7213a.f12772b.getClass();
                c2466pM7213a.f12772b.getClass();
                C2466p.d dVar = c2466pM7213a.f12772b.f12842c;
                if (dVar == null || C10134c0.f51354a < 18) {
                    interfaceC2399c = InterfaceC2399c.f12205a;
                } else {
                    synchronized (obj2) {
                        defaultDrmSessionManagerM6959b = C10134c0.m19034a(dVar, null) ? null : C2397a.m6959b(dVar);
                        defaultDrmSessionManagerM6959b.getClass();
                    }
                    interfaceC2399c = defaultDrmSessionManagerM6959b;
                }
                C2497n c2497n = new C2497n(c2466pM7213a, aVar, c5509a, interfaceC2399c, c2527a, 1048576);
                long jDoubleValue = d11 != null ? (long) (d11.doubleValue() * ((double) 1000000)) : Long.MIN_VALUE;
                CoroutineDispatcher coroutineDispatcher = ttsControllerImpl.f16572c;
                TtsControllerImpl$playClipped$2 ttsControllerImpl$playClipped$3 = new TtsControllerImpl$playClipped$2(ttsControllerImpl, c2497n, d10, jDoubleValue, f3, c2466pM7213a, d11, null);
                ttsControllerImpl$playClipped$2.f16626f = 1;
                if (C7828f.m15574h(ttsControllerImpl$playClipped$2, coroutineDispatcher, ttsControllerImpl$playClipped$3) == coroutineSingletons) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static final Object m9334e(TtsControllerImpl ttsControllerImpl, String str, String str2, InterfaceC9968c interfaceC9968c) throws Throwable {
        TtsControllerImpl$startTimer$1 ttsControllerImpl$startTimer$1;
        ttsControllerImpl.getClass();
        if (interfaceC9968c instanceof TtsControllerImpl$startTimer$1) {
            ttsControllerImpl$startTimer$1 = (TtsControllerImpl$startTimer$1) interfaceC9968c;
            int i10 = ttsControllerImpl$startTimer$1.f16668i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ttsControllerImpl$startTimer$1.f16668i = i10 - Integer.MIN_VALUE;
            } else {
                ttsControllerImpl$startTimer$1 = new TtsControllerImpl$startTimer$1(ttsControllerImpl, interfaceC9968c);
            }
        } else {
            ttsControllerImpl$startTimer$1 = new TtsControllerImpl$startTimer$1(ttsControllerImpl, interfaceC9968c);
        }
        Object objM14360a = ttsControllerImpl$startTimer$1.f16666g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = ttsControllerImpl$startTimer$1.f16668i;
        if (i11 == 0) {
            C7499b.m14977z0(objM14360a);
            PreferenceStoreImpl$special$$inlined$map$7 preferenceStoreImpl$special$$inlined$map$7Mo9579Z = ttsControllerImpl.f16574e.mo9579Z();
            ttsControllerImpl$startTimer$1.f16663d = ttsControllerImpl;
            ttsControllerImpl$startTimer$1.f16664e = str;
            ttsControllerImpl$startTimer$1.f16665f = str2;
            ttsControllerImpl$startTimer$1.f16668i = 1;
            objM14360a = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$7Mo9579Z, ttsControllerImpl$startTimer$1);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = ttsControllerImpl$startTimer$1.f16665f;
            str = ttsControllerImpl$startTimer$1.f16664e;
            ttsControllerImpl = ttsControllerImpl$startTimer$1.f16663d;
            C7499b.m14977z0(objM14360a);
        }
        boolean zBooleanValue = ((Boolean) objM14360a).booleanValue();
        C4924a.m10450b(ttsControllerImpl.f16565H);
        if (zBooleanValue) {
            ttsControllerImpl.f16565H = C7828f.m15570d(ttsControllerImpl.f16571b, null, null, new TtsControllerImpl$startTimer$2(ttsControllerImpl, str, str2, null), 3);
        }
        return C9072e.f47360a;
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: E0 */
    public final void mo9335E0(String str, Set<String> set) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(set, "text");
        C7828f.m15570d(this.f16571b, null, null, new TtsControllerImpl$fetchBatch$1(this, str, set, null), 3);
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: K */
    public final void mo9336K() {
        C4924a.m10450b(this.f16566I);
        C2413j c2413j = this.f16576g;
        c2413j.stop();
        c2413j.clearMediaItems();
        c2413j.prepare();
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: M1 */
    public final void mo9337M1(int i10, double d10, Double d11, float f3) {
        C7828f.m15570d(this.f16571b, null, null, new TtsControllerImpl$speakSentence$1(this, i10, d10, d11, f3, null), 3);
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: O1 */
    public final void mo9338O1(String str) {
        C5207g.m11111f(str, "language");
        C7828f.m15570d(this.f16571b, null, null, new TtsControllerImpl$updateVoices$1(this, str, null), 3);
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: c */
    public final InterfaceC7116c<Long> mo9339c() {
        return this.f16581l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final Voice m9340f(String str) {
        Set<Voice> voices;
        TextToSpeech textToSpeech = this.f16577h;
        Object obj = null;
        Voice voice = obj;
        if (textToSpeech != null && (voices = textToSpeech.getVoices()) != null) {
            voice = obj;
            for (Object obj2 : voices) {
                if (C5207g.m11106a(((Voice) obj2).getName(), str)) {
                    obj = obj2;
                    break;
                }
            }
            voice = (Voice) obj;
        }
        voice = obj;
        return voice;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e9 A[Catch: Exception -> 0x0112, TryCatch #0 {Exception -> 0x0112, blocks: (B:36:0x00e4, B:38:0x00e9, B:40:0x00f5, B:41:0x00f9), top: B:47:0x00e4 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f5 A[Catch: Exception -> 0x0112, TryCatch #0 {Exception -> 0x0112, blocks: (B:36:0x00e4, B:38:0x00e9, B:40:0x00f5, B:41:0x00f9), top: B:47:0x00e4 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: g */
    public final Object m9341g(String str, String str2, float f3, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        TtsControllerImpl$localSpeak$1 ttsControllerImpl$localSpeak$1;
        Object obj;
        float f10;
        TtsControllerImpl ttsControllerImpl;
        String str3;
        float f11;
        TtsControllerImpl ttsControllerImpl2;
        String str4;
        boolean z10;
        LocalTextToSpeechVoice localTextToSpeechVoice;
        String str5;
        Voice voiceM9340f;
        TextToSpeech textToSpeech;
        if (interfaceC9968c instanceof TtsControllerImpl$localSpeak$1) {
            ttsControllerImpl$localSpeak$1 = (TtsControllerImpl$localSpeak$1) interfaceC9968c;
            int i10 = ttsControllerImpl$localSpeak$1.f16615l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ttsControllerImpl$localSpeak$1.f16615l = i10 - Integer.MIN_VALUE;
            } else {
                ttsControllerImpl$localSpeak$1 = new TtsControllerImpl$localSpeak$1(this, interfaceC9968c);
            }
        } else {
            ttsControllerImpl$localSpeak$1 = new TtsControllerImpl$localSpeak$1(this, interfaceC9968c);
        }
        Object obj2 = ttsControllerImpl$localSpeak$1.f16613j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = ttsControllerImpl$localSpeak$1.f16615l;
        if (i11 != 0) {
            if (i11 == 1) {
                float f12 = ttsControllerImpl$localSpeak$1.f16611h;
                str2 = ttsControllerImpl$localSpeak$1.f16609f;
                str = ttsControllerImpl$localSpeak$1.f16608e;
                TtsControllerImpl ttsControllerImpl3 = ttsControllerImpl$localSpeak$1.f16607d;
                C7499b.m14977z0(obj2);
                f10 = f12;
                ttsControllerImpl = ttsControllerImpl3;
                obj = obj2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = ttsControllerImpl$localSpeak$1.f16612i;
                f11 = ttsControllerImpl$localSpeak$1.f16611h;
                ttsControllerImpl = ttsControllerImpl$localSpeak$1.f16610g;
                str3 = ttsControllerImpl$localSpeak$1.f16609f;
                str4 = ttsControllerImpl$localSpeak$1.f16608e;
                ttsControllerImpl2 = ttsControllerImpl$localSpeak$1.f16607d;
                C7499b.m14977z0(obj2);
            }
            localTextToSpeechVoice = (LocalTextToSpeechVoice) ((Map) obj2).get(str4);
            if (localTextToSpeechVoice != null || (str5 = localTextToSpeechVoice.f21601a) == null) {
                str5 = "";
            }
            voiceM9340f = ttsControllerImpl.m9340f(str5);
            if (z10 && !C5207g.m11106a(ttsControllerImpl2.f16567J, str3)) {
                ttsControllerImpl2.f16569L = true;
                ttsControllerImpl2.f16568K = str3;
                try {
                    textToSpeech = ttsControllerImpl2.f16577h;
                    if (textToSpeech != null) {
                        textToSpeech.setLanguage(new Locale(str4));
                        if (voiceM9340f == null) {
                            voiceM9340f = textToSpeech.getDefaultVoice();
                        }
                        textToSpeech.setVoice(voiceM9340f);
                        textToSpeech.setSpeechRate(f11);
                        textToSpeech.speak(str3, 0, null, str3);
                        new Integer(textToSpeech.setOnUtteranceProgressListener(ttsControllerImpl2.new C3267a()));
                    }
                } catch (Exception e10) {
                    C6041e.m12476a().m12477b(e10);
                    ttsControllerImpl2.f16569L = false;
                }
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj2);
        PreferenceStoreImpl$special$$inlined$map$7 preferenceStoreImpl$special$$inlined$map$7Mo9579Z = this.f16574e.mo9579Z();
        ttsControllerImpl$localSpeak$1.f16607d = this;
        ttsControllerImpl$localSpeak$1.f16608e = str;
        ttsControllerImpl$localSpeak$1.f16609f = str2;
        ttsControllerImpl$localSpeak$1.f16611h = f3;
        ttsControllerImpl$localSpeak$1.f16615l = 1;
        Object objM14360a = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$7Mo9579Z, ttsControllerImpl$localSpeak$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        obj = objM14360a;
        f10 = f3;
        ttsControllerImpl = this;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        InterfaceC7116c<Map<String, LocalTextToSpeechVoice>> interfaceC7116cMo9595j = ttsControllerImpl.f16574e.mo9595j();
        ttsControllerImpl$localSpeak$1.f16607d = ttsControllerImpl;
        ttsControllerImpl$localSpeak$1.f16608e = str;
        ttsControllerImpl$localSpeak$1.f16609f = str2;
        ttsControllerImpl$localSpeak$1.f16610g = ttsControllerImpl;
        ttsControllerImpl$localSpeak$1.f16611h = f10;
        ttsControllerImpl$localSpeak$1.f16612i = zBooleanValue;
        ttsControllerImpl$localSpeak$1.f16615l = 2;
        Object objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9595j, ttsControllerImpl$localSpeak$1);
        if (objM14360a2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        str3 = str2;
        f11 = f10;
        obj2 = objM14360a2;
        ttsControllerImpl2 = ttsControllerImpl;
        str4 = str;
        z10 = zBooleanValue;
        localTextToSpeechVoice = (LocalTextToSpeechVoice) ((Map) obj2).get(str4);
        if (localTextToSpeechVoice != null) {
            str5 = "";
        } else {
            str5 = "";
        }
        voiceM9340f = ttsControllerImpl.m9340f(str5);
        if (z10) {
            ttsControllerImpl2.f16569L = true;
            ttsControllerImpl2.f16568K = str3;
            textToSpeech = ttsControllerImpl2.f16577h;
            if (textToSpeech != null) {
                textToSpeech.setLanguage(new Locale(str4));
                if (voiceM9340f == null) {
                    voiceM9340f = textToSpeech.getDefaultVoice();
                }
                textToSpeech.setVoice(voiceM9340f);
                textToSpeech.setSpeechRate(f11);
                textToSpeech.speak(str3, 0, null, str3);
                new Integer(textToSpeech.setOnUtteranceProgressListener(ttsControllerImpl2.new C3267a()));
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: h0 */
    public final Object mo9342h0(String str, InterfaceC9968c<? super List<LocalTextToSpeechVoice>> interfaceC9968c) {
        Set<Voice> voices;
        Object next;
        String strM770q;
        String str2;
        String str3;
        boolean z10;
        TextToSpeech textToSpeech = this.f16577h;
        if (textToSpeech != null && (voices = textToSpeech.getVoices()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = voices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                Voice voice = (Voice) next2;
                if (!C5207g.m11106a(voice.getLocale().getLanguage(), str)) {
                    String iSO3Language = voice.getLocale().getISO3Language();
                    C5207g.m11110e(iSO3Language, "it.locale.isO3Language");
                    z10 = C5207g.m11106a(C7076b.m14301u3(iSO3Language, new C6526i(0, 1)), str);
                }
                if (z10) {
                    arrayList.add(next2);
                }
            }
            List listM13447o0 = C6752c.m13447o0(arrayList, new C3268b());
            if (listM13447o0 != null) {
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(listM13447o0, 10));
                int i10 = 0;
                for (Object obj : listM13447o0) {
                    int i11 = i10 + 1;
                    String string = null;
                    if (i10 < 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    Voice voice2 = (Voice) obj;
                    String name = voice2.getName();
                    C5207g.m11110e(name, "voice.name");
                    Context context = this.f16570a;
                    C5207g.m11111f(context, "context");
                    C5207g.m11111f(str, "language");
                    Set<String> features = voice2.getFeatures();
                    C5207g.m11110e(features, "this.features");
                    Iterator<T> it2 = features.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        str3 = (String) next;
                        C5207g.m11110e(str3, "it");
                    } while (!C7076b.m14278X2(str3, "gender", false));
                    String str4 = (String) next;
                    if (str4 != null && (str2 = (String) C6752c.m13432Z(C7076b.m14299s3(str4, new String[]{"="}, 0, 6))) != null) {
                        if (str2.length() > 0) {
                            StringBuilder sb2 = new StringBuilder();
                            String strValueOf = String.valueOf(str2.charAt(0));
                            C5207g.m11109d(strValueOf, "null cannot be cast to non-null type java.lang.String");
                            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                            C5207g.m11110e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                            sb2.append((Object) upperCase);
                            String strSubstring = str2.substring(1);
                            C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
                            sb2.append(strSubstring);
                            string = sb2.toString();
                        } else {
                            string = str2;
                        }
                    }
                    if (string == null) {
                        String string2 = context.getString(R.string.local_tts_voice);
                        C5207g.m11110e(string2, "context.getString(R.string.local_tts_voice)");
                        strM770q = C0166e.m770q(new Object[]{C4924a.m10439R(context, str), Integer.valueOf(i11)}, 2, string2, "format(format, *args)");
                    } else {
                        String string3 = context.getString(R.string.local_tts_gender_voice);
                        C5207g.m11110e(string3, "context.getString(R.string.local_tts_gender_voice)");
                        strM770q = C0166e.m770q(new Object[]{C4924a.m10439R(context, str), string, Integer.valueOf(i11)}, 3, string3, "format(format, *args)");
                    }
                    arrayList2.add(new LocalTextToSpeechVoice(name, strM770q));
                    i10 = i11;
                }
                return arrayList2;
            }
        }
        return EmptyList.f38032a;
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: o */
    public final void mo9343o(String str, String str2, boolean z10, float f3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "text");
        C7828f.m15570d(this.f16571b, null, null, new TtsControllerImpl$speak$1(this, str, str2, z10, f3, null), 3);
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i10) {
    }

    @Override // com.lingq.commons.controllers.InterfaceC3275c
    /* JADX INFO: renamed from: t */
    public final InterfaceC7116c<Boolean> mo9344t() {
        return this.f16579j;
    }
}

package com.lingq.shared.repository;

import androidx.room.RoomDatabaseKt;
import bi.AbstractC1485m5;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.TtsVoice;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.uimodel.TextToSpeechVoice;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p367rh.C8795i;
import p385sf.C9000b;
import p460wh.InterfaceC9949q;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "", "Lcom/lingq/shared/uimodel/TextToSpeechVoice;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.TtsRepositoryImpl$observableTtsVoices$2", m19206f = "TtsRepository.kt", m19207l = {83, 84, 91, 92}, m19208m = "invokeSuspend")
final class TtsRepositoryImpl$observableTtsVoices$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends List<? extends TextToSpeechVoice>>>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f20599e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f20600f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f20601g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TtsRepositoryImpl f20602h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f20603i;

    /* JADX INFO: renamed from: com.lingq.shared.repository.TtsRepositoryImpl$observableTtsVoices$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.shared.repository.TtsRepositoryImpl$observableTtsVoices$2$1", m19206f = "TtsRepository.kt", m19207l = {85, 86}, m19208m = "invokeSuspend")
    public static final class C33231 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f20604e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TtsRepositoryImpl f20605f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ List<TtsVoice> f20606g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f20607h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33231(TtsRepositoryImpl ttsRepositoryImpl, List<TtsVoice> list, String str, InterfaceC9968c<? super C33231> interfaceC9968c) {
            super(1, interfaceC9968c);
            this.f20605f = ttsRepositoryImpl;
            this.f20606g = list;
            this.f20607h = str;
        }

        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C33231) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: s */
        public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
            return new C33231(this.f20605f, this.f20606g, this.f20607h, interfaceC9968c);
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f20604e;
            List<TtsVoice> list = this.f20606g;
            TtsRepositoryImpl ttsRepositoryImpl = this.f20605f;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
            }
            C7499b.m14977z0(obj);
            AbstractC1485m5 abstractC1485m5 = ttsRepositoryImpl.f20565b;
            this.f20604e = 1;
            if (abstractC1485m5.mo599i0(list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            AbstractC1485m5 abstractC1485m6 = ttsRepositoryImpl.f20565b;
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            int i11 = 0;
            for (Object obj2 : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C9000b.m17257w();
                    throw null;
                }
                arrayList.add(new C8795i(this.f20607h, i11, ((TtsVoice) obj2).f17566a));
                i11 = i12;
            }
            this.f20604e = 2;
            return abstractC1485m6.mo5106p0(arrayList, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$observableTtsVoices$2(boolean z10, TtsRepositoryImpl ttsRepositoryImpl, String str, InterfaceC9968c<? super TtsRepositoryImpl$observableTtsVoices$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f20601g = z10;
        this.f20602h = ttsRepositoryImpl;
        this.f20603i = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        TtsRepositoryImpl$observableTtsVoices$2 ttsRepositoryImpl$observableTtsVoices$2 = new TtsRepositoryImpl$observableTtsVoices$2(this.f20601g, this.f20602h, this.f20603i, interfaceC9968c);
        ttsRepositoryImpl$observableTtsVoices$2.f20600f = obj;
        return ttsRepositoryImpl$observableTtsVoices$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends List<? extends TextToSpeechVoice>>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TtsRepositoryImpl$observableTtsVoices$2) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7117d interfaceC7117d;
        Resource resourceM9437c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f20599e;
        String str = this.f20603i;
        TtsRepositoryImpl ttsRepositoryImpl = this.f20602h;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            interfaceC7117d = (InterfaceC7117d) this.f20600f;
            if (this.f20601g) {
                InterfaceC9949q interfaceC9949q = ttsRepositoryImpl.f20566c;
                this.f20600f = interfaceC7117d;
                this.f20599e = 1;
                obj = interfaceC9949q.m18527a(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            AbstractC1485m5 abstractC1485m5 = ttsRepositoryImpl.f20565b;
            this.f20600f = interfaceC7117d;
            this.f20599e = 3;
            obj = abstractC1485m5.mo5102l0(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            Resource.f17861d.getClass();
            resourceM9437c = Resource.C3303a.m9437c((List) obj);
            this.f20600f = null;
            this.f20599e = 4;
            if (interfaceC7117d.mo1339r(resourceM9437c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
        if (i10 == 1) {
            interfaceC7117d = (InterfaceC7117d) this.f20600f;
            C7499b.m14977z0(obj);
        } else if (i10 == 2) {
            interfaceC7117d = (InterfaceC7117d) this.f20600f;
            C7499b.m14977z0(obj);
            AbstractC1485m5 abstractC1485m6 = ttsRepositoryImpl.f20565b;
            this.f20600f = interfaceC7117d;
            this.f20599e = 3;
            obj = abstractC1485m6.mo5102l0(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            Resource.f17861d.getClass();
            resourceM9437c = Resource.C3303a.m9437c((List) obj);
            this.f20600f = null;
            this.f20599e = 4;
            if (interfaceC7117d.mo1339r(resourceM9437c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i10 == 3) {
            interfaceC7117d = (InterfaceC7117d) this.f20600f;
            C7499b.m14977z0(obj);
            Resource.f17861d.getClass();
            resourceM9437c = Resource.C3303a.m9437c((List) obj);
            this.f20600f = null;
            this.f20599e = 4;
            if (interfaceC7117d.mo1339r(resourceM9437c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
        LingQDatabase lingQDatabase = ttsRepositoryImpl.f20564a;
        C33231 c33231 = new C33231(ttsRepositoryImpl, (List) obj, str, null);
        this.f20600f = interfaceC7117d;
        this.f20599e = 2;
        if (RoomDatabaseKt.m4573a(lingQDatabase, c33231, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        AbstractC1485m5 abstractC1485m7 = ttsRepositoryImpl.f20565b;
        this.f20600f = interfaceC7117d;
        this.f20599e = 3;
        obj = abstractC1485m7.mo5102l0(str, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        Resource.f17861d.getClass();
        resourceM9437c = Resource.C3303a.m9437c((List) obj);
        this.f20600f = null;
        this.f20599e = 4;
        if (interfaceC7117d.mo1339r(resourceM9437c, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}

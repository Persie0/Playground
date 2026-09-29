package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.dao.C1315c;
import com.lingq.core.database.entity.ChatHistoryEntity;
import com.lingq.core.database.entity.ChatStatsEntity;
import com.lingq.core.database.entity.ChatSuggestionEntity;
import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.domain.model.chat.ChatMessagePhrases;
import com.lingq.core.domain.model.chat.ChatMessageRating;
import com.lingq.core.domain.model.chat.ChatMessageTranslation;
import com.lingq.core.domain.model.chat.LynxChatModel;
import com.lingq.core.domain.model.chat.LynxReasoningEffort;
import com.lingq.core.network.api.requests.RequestChatConfig;
import com.lingq.core.network.api.requests.RequestChatDataUsage;
import com.lingq.core.network.api.requests.RequestChatMemory;
import com.lingq.core.network.api.requests.RequestChatMessageRating;
import com.lingq.core.network.api.requests.RequestChatNew;
import com.lingq.core.network.api.requests.RequestChatReply;
import com.lingq.core.network.api.requests.RequestOnboardingSurveyItem;
import com.lingq.core.network.api.requests.RequestSeedOnboarding;
import com.lingq.core.network.api.result.ResultChatBot;
import com.lingq.core.network.api.result.ResultChatBotMessage;
import com.lingq.core.network.api.result.ResultChatDataUsage;
import com.lingq.core.network.api.result.ResultChatHistorySimple;
import com.lingq.core.network.api.result.ResultChatMemory;
import com.lingq.core.network.api.result.ResultChatMessage;
import com.lingq.core.network.api.result.ResultChatMessageRating;
import com.lingq.core.network.api.result.ResultChatModelConfig;
import com.lingq.core.network.api.result.ResultChatOld;
import com.lingq.core.network.api.result.ResultChatPhrase;
import com.lingq.core.network.api.result.ResultChatStats;
import com.lingq.core.network.api.result.ResultChatSuggestion;
import com.lingq.core.network.api.result.ResultLesson;
import com.lingq.core.network.api.result.ResultPhrases;
import com.lingq.core.network.api.result.ResultTranslationChat;
import com.lingq.core.network.api.result.Results;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.serialization.json.C3263c;
import kotlinx.serialization.json.JsonNull;
import p000.AbstractC3352my;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.C3485q5;
import p000.ax0;
import p000.c83;
import p000.d32;
import p000.df4;
import p000.dn5;
import p000.eu0;
import p000.fqc;
import p000.gqc;
import p000.h0a;
import p000.kv0;
import p000.lv0;
import p000.mv0;
import p000.mw0;
import p000.nn5;
import p000.no8;
import p000.nv0;
import p000.o7b;
import p000.ow0;
import p000.oz0;
import p000.pw0;
import p000.qv0;
import p000.qw0;
import p000.rm5;
import p000.rn5;
import p000.rv0;
import p000.s70;
import p000.sf4;
import p000.sm5;
import p000.u91;
import p000.ul0;
import p000.um5;
import p000.un0;
import p000.un5;
import p000.v91;
import p000.vk9;
import p000.vz1;
import p000.ww6;
import p000.xfa;
import p000.xm5;
import p000.zj6;
import p000.zw0;
import p000.zx0;

/* JADX INFO: renamed from: com.lingq.core.data.repository.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1289e implements zw0 {
    private static final ax0 Companion = new ax0();

    /* JADX INFO: renamed from: a */
    public final C1315c f16467a;

    /* JADX INFO: renamed from: b */
    public final un0 f16468b;

    /* JADX INFO: renamed from: c */
    public final o7b f16469c;

    /* JADX INFO: renamed from: d */
    public final zx0 f16470d;

    /* JADX INFO: renamed from: e */
    public final df4 f16471e;

    /* JADX INFO: renamed from: f */
    public final C3244l f16472f;

    public C1289e(C1315c c1315c, un0 un0Var, o7b o7bVar, zx0 zx0Var, df4 df4Var) {
        c1315c.getClass();
        un0Var.getClass();
        o7bVar.getClass();
        zx0Var.getClass();
        df4Var.getClass();
        this.f16467a = c1315c;
        this.f16468b = un0Var;
        this.f16469c = o7bVar;
        this.f16470d = zx0Var;
        this.f16471e = df4Var;
        this.f16472f = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: A */
    public final Object m7150A(String str, int i, LynxChatModel lynxChatModel, LynxReasoningEffort lynxReasoningEffort, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$updateChatModelConfig$1 chatRepositoryImpl$updateChatModelConfig$1;
        Object objM21335b;
        Object objM21335b2;
        String value;
        String id;
        if (continuationImpl instanceof ChatRepositoryImpl$updateChatModelConfig$1) {
            chatRepositoryImpl$updateChatModelConfig$1 = (ChatRepositoryImpl$updateChatModelConfig$1) continuationImpl;
            int i2 = chatRepositoryImpl$updateChatModelConfig$1.f15026d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$updateChatModelConfig$1.f15026d = i2 - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$updateChatModelConfig$1 = new ChatRepositoryImpl$updateChatModelConfig$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$updateChatModelConfig$1 = new ChatRepositoryImpl$updateChatModelConfig$1(this, continuationImpl);
        }
        Object objM25814c = chatRepositoryImpl$updateChatModelConfig$1.f15024b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = chatRepositoryImpl$updateChatModelConfig$1.f15026d;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM25814c);
                if (lynxChatModel == null || (id = lynxChatModel.getId()) == null || (objM21335b = sf4.m21335b(id)) == null) {
                    objM21335b = JsonNull.INSTANCE;
                }
                Pair pair = new Pair("model", objM21335b);
                if (lynxReasoningEffort == null || (value = lynxReasoningEffort.getValue()) == null || (objM21335b2 = sf4.m21335b(value)) == null) {
                    objM21335b2 = JsonNull.INSTANCE;
                }
                C3263c c3263c = new C3263c(AbstractC3194a.m15365R(pair, new Pair("reasoning_effort", objM21335b2)));
                zx0 zx0Var = this.f16470d;
                chatRepositoryImpl$updateChatModelConfig$1.f15023a = this;
                chatRepositoryImpl$updateChatModelConfig$1.f15026d = 1;
                objM25814c = zx0Var.m25814c(str, i, c3263c, chatRepositoryImpl$updateChatModelConfig$1);
                if (objM25814c == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = chatRepositoryImpl$updateChatModelConfig$1.f15023a;
                AbstractC3193b.m15359b(objM25814c);
            }
            ResultChatModelConfig resultChatModelConfig = (ResultChatModelConfig) objM25814c;
            this.getClass();
            dn5 dn5Var = LynxChatModel.Companion;
            String strM8348a = resultChatModelConfig.m8348a();
            dn5Var.getClass();
            LynxChatModel lynxChatModelM10491a = dn5.m10491a(strM8348a);
            un5 un5Var = LynxReasoningEffort.Companion;
            String strM8349b = resultChatModelConfig.m8349b();
            un5Var.getClass();
            return new xm5(new nn5(lynxChatModelM10491a, un5.m22838a(strM8349b)));
        } catch (Exception e) {
            rm5 rm5Var = sm5.Companion;
            String str2 = "ChatRepository: updateChatModelConfig failed - " + e.getMessage();
            rm5Var.getClass();
            h0a.f41641a.mo11433g(str2, new Object[0]);
            return new um5(zj6.f71653a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m7151a(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$chatStats$1 chatRepositoryImpl$chatStats$1;
        if (continuationImpl instanceof ChatRepositoryImpl$chatStats$1) {
            chatRepositoryImpl$chatStats$1 = (ChatRepositoryImpl$chatStats$1) continuationImpl;
            int i2 = chatRepositoryImpl$chatStats$1.f14877d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$chatStats$1.f14877d = i2 - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$chatStats$1 = new ChatRepositoryImpl$chatStats$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$chatStats$1 = new ChatRepositoryImpl$chatStats$1(this, continuationImpl);
        }
        Object objM25835x = chatRepositoryImpl$chatStats$1.f14875b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = chatRepositoryImpl$chatStats$1.f14877d;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM25835x);
                zx0 zx0Var = this.f16470d;
                chatRepositoryImpl$chatStats$1.f14874a = i;
                chatRepositoryImpl$chatStats$1.f14877d = 1;
                objM25835x = zx0Var.m25835x(str, i, chatRepositoryImpl$chatStats$1);
                if (objM25835x == coroutineSingletons) {
                }
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    AbstractC3193b.m15359b(objM25835x);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = chatRepositoryImpl$chatStats$1.f14874a;
            AbstractC3193b.m15359b(objM25835x);
            C1315c c1315c = this.f16467a;
            ChatStatsEntity chatStatsEntityM12828a = gqc.m12828a((ResultChatStats) objM25835x, i);
            chatRepositoryImpl$chatStats$1.f14874a = i;
            chatRepositoryImpl$chatStats$1.f14877d = 2;
            Object objM2861d = AbstractC0758a.m2861d(new s70(15, c1315c, chatStatsEntityM12828a), c1315c.f17001K, chatRepositoryImpl$chatStats$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            return objM2861d == coroutineSingletons ? coroutineSingletons : xfaVar;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m7152b(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$closeChat$1 chatRepositoryImpl$closeChat$1;
        if (continuationImpl instanceof ChatRepositoryImpl$closeChat$1) {
            chatRepositoryImpl$closeChat$1 = (ChatRepositoryImpl$closeChat$1) continuationImpl;
            int i2 = chatRepositoryImpl$closeChat$1.f14881d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$closeChat$1.f14881d = i2 - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$closeChat$1 = new ChatRepositoryImpl$closeChat$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$closeChat$1 = new ChatRepositoryImpl$closeChat$1(this, continuationImpl);
        }
        Object obj = chatRepositoryImpl$closeChat$1.f14879b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = chatRepositoryImpl$closeChat$1.f14881d;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(obj);
                zx0 zx0Var = this.f16470d;
                chatRepositoryImpl$closeChat$1.f14878a = i;
                chatRepositoryImpl$closeChat$1.f14881d = 1;
                if (zx0Var.m25819h(str, i, chatRepositoryImpl$closeChat$1) == coroutineSingletons) {
                }
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = chatRepositoryImpl$closeChat$1.f14878a;
            AbstractC3193b.m15359b(obj);
            C1315c c1315c = this.f16467a;
            chatRepositoryImpl$closeChat$1.f14878a = i;
            chatRepositoryImpl$closeChat$1.f14881d = 2;
            Object objM2861d = AbstractC0758a.m2861d(new mv0(i, 0), c1315c.f17001K, chatRepositoryImpl$closeChat$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            return objM2861d == coroutineSingletons ? coroutineSingletons : xfaVar;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m7153c(int i, int i2, String str, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$deleteMessageRating$1 chatRepositoryImpl$deleteMessageRating$1;
        if (continuationImpl instanceof ChatRepositoryImpl$deleteMessageRating$1) {
            chatRepositoryImpl$deleteMessageRating$1 = (ChatRepositoryImpl$deleteMessageRating$1) continuationImpl;
            int i3 = chatRepositoryImpl$deleteMessageRating$1.f14884c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$deleteMessageRating$1.f14884c = i3 - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$deleteMessageRating$1 = new ChatRepositoryImpl$deleteMessageRating$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$deleteMessageRating$1 = new ChatRepositoryImpl$deleteMessageRating$1(this, continuationImpl);
        }
        Object obj = chatRepositoryImpl$deleteMessageRating$1.f14882a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = chatRepositoryImpl$deleteMessageRating$1.f14884c;
        try {
            if (i4 == 0) {
                AbstractC3193b.m15359b(obj);
                zx0 zx0Var = this.f16470d;
                chatRepositoryImpl$deleteMessageRating$1.f14884c = 1;
                if (zx0Var.m25821j(str, i, i2, chatRepositoryImpl$deleteMessageRating$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i4 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return new xm5(xfa.f68157a);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            rm5 rm5Var = sm5.Companion;
            String str2 = "ChatRepository: deleteMessageRating failed - " + e2.getMessage();
            rm5Var.getClass();
            h0a.f41641a.mo11433g(str2, new Object[0]);
            return new um5(zj6.f71653a);
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m7154d(String str, String str2, String str3, SuspendLambda suspendLambda) throws Throwable {
        Object objM7174x = m7174x(-2, str, str2, vz1.m23604J(new ResultChatMessage(0, str3, 448)), suspendLambda);
        return objM7174x == CoroutineSingletons.COROUTINE_SUSPENDED ? objM7174x : xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        if (m7174x(r8, r9, r10, r11, r12) == r1) goto L27;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7155e(int i, String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$dummyMessage$1 chatRepositoryImpl$dummyMessage$1;
        if (continuationImpl instanceof ChatRepositoryImpl$dummyMessage$1) {
            chatRepositoryImpl$dummyMessage$1 = (ChatRepositoryImpl$dummyMessage$1) continuationImpl;
            int i2 = chatRepositoryImpl$dummyMessage$1.f14891g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$dummyMessage$1.f14891g = i2 - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$dummyMessage$1 = new ChatRepositoryImpl$dummyMessage$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$dummyMessage$1 = new ChatRepositoryImpl$dummyMessage$1(this, continuationImpl);
        }
        ChatRepositoryImpl$dummyMessage$1 chatRepositoryImpl$dummyMessage$2 = chatRepositoryImpl$dummyMessage$1;
        Object objM2861d = chatRepositoryImpl$dummyMessage$2.f14889e;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = chatRepositoryImpl$dummyMessage$2.f14891g;
        int iM8013a = 1;
        if (i3 != 0) {
            if (i3 == 1) {
                i = chatRepositoryImpl$dummyMessage$2.f14888d;
                str3 = chatRepositoryImpl$dummyMessage$2.f14887c;
                str2 = chatRepositoryImpl$dummyMessage$2.f14886b;
                str = chatRepositoryImpl$dummyMessage$2.f14885a;
                AbstractC3193b.m15359b(objM2861d);
            } else {
                if (i3 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM2861d);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(objM2861d);
        chatRepositoryImpl$dummyMessage$2.f14885a = str;
        chatRepositoryImpl$dummyMessage$2.f14886b = str2;
        chatRepositoryImpl$dummyMessage$2.f14887c = str3;
        chatRepositoryImpl$dummyMessage$2.f14888d = i;
        chatRepositoryImpl$dummyMessage$2.f14891g = 1;
        C1315c c1315c = this.f16467a;
        objM2861d = AbstractC0758a.m2861d(new qv0(i, c1315c, iM8013a), c1315c.f17001K, chatRepositoryImpl$dummyMessage$2, true, false);
        if (objM2861d != obj) {
        }
        return obj;
        ChatHistoryEntity chatHistoryEntity = (ChatHistoryEntity) objM2861d;
        if (chatHistoryEntity != null && !chatHistoryEntity.m7561d().isEmpty()) {
            iM8013a = 1 + ((ChatMessage) chatHistoryEntity.m7561d().get(vz1.m23602H(chatHistoryEntity.m7561d()))).m8013a();
        }
        List listM23604J = vz1.m23604J(new ResultChatMessage(iM8013a, str3, 496));
        chatRepositoryImpl$dummyMessage$2.f14885a = null;
        chatRepositoryImpl$dummyMessage$2.f14886b = null;
        chatRepositoryImpl$dummyMessage$2.f14887c = null;
        chatRepositoryImpl$dummyMessage$2.f14888d = i;
        chatRepositoryImpl$dummyMessage$2.f14891g = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m7156f(String str, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$fetchChatBotConfig$1 chatRepositoryImpl$fetchChatBotConfig$1;
        kv0 kv0Var;
        C3244l c3244l;
        Object value;
        if (continuationImpl instanceof ChatRepositoryImpl$fetchChatBotConfig$1) {
            chatRepositoryImpl$fetchChatBotConfig$1 = (ChatRepositoryImpl$fetchChatBotConfig$1) continuationImpl;
            int i = chatRepositoryImpl$fetchChatBotConfig$1.f14895d;
            if ((i & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$fetchChatBotConfig$1.f14895d = i - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$fetchChatBotConfig$1 = new ChatRepositoryImpl$fetchChatBotConfig$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$fetchChatBotConfig$1 = new ChatRepositoryImpl$fetchChatBotConfig$1(this, continuationImpl);
        }
        Object objM25827p = chatRepositoryImpl$fetchChatBotConfig$1.f14893b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chatRepositoryImpl$fetchChatBotConfig$1.f14895d;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM25827p);
                zx0 zx0Var = this.f16470d;
                chatRepositoryImpl$fetchChatBotConfig$1.f14892a = str;
                chatRepositoryImpl$fetchChatBotConfig$1.f14895d = 1;
                objM25827p = zx0Var.m25827p(str, chatRepositoryImpl$fetchChatBotConfig$1);
                if (objM25827p == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = chatRepositoryImpl$fetchChatBotConfig$1.f14892a;
                AbstractC3193b.m15359b(objM25827p);
            }
            ResultChatBot resultChatBot = (ResultChatBot) u91.m22591I0((List) objM25827p);
            if (resultChatBot != null) {
                String str2 = resultChatBot.f20693c;
                String str3 = resultChatBot.f20696f.f20702a;
                ResultChatBotMessage resultChatBotMessage = resultChatBot.f20695e;
                kv0Var = new kv0(str2, str3, resultChatBotMessage.f20699a.f20698a, resultChatBotMessage.f20700b.f20698a, resultChatBot.f20697g.f20703a);
            } else {
                kv0Var = new kv0();
            }
        } catch (Exception unused) {
            kv0Var = new kv0();
        }
        do {
            c3244l = this.f16472f;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, AbstractC3194a.m15368U((Map) value, new Pair(str, kv0Var))));
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0132 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:17:0x0045, B:57:0x012c, B:59:0x0132, B:60:0x014c, B:62:0x0152, B:63:0x0170, B:65:0x0176, B:67:0x017e, B:71:0x0198, B:72:0x01a8, B:73:0x01ad, B:74:0x01ae, B:75:0x01c0, B:24:0x005a, B:56:0x011f, B:25:0x005f, B:28:0x0068, B:40:0x00a1, B:42:0x00a7, B:45:0x00c9, B:46:0x00dd, B:48:0x00e3, B:49:0x00f1, B:51:0x00f7, B:52:0x00fb, B:31:0x0073, B:37:0x008a, B:34:0x007a), top: B:86:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0152 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:17:0x0045, B:57:0x012c, B:59:0x0132, B:60:0x014c, B:62:0x0152, B:63:0x0170, B:65:0x0176, B:67:0x017e, B:71:0x0198, B:72:0x01a8, B:73:0x01ad, B:74:0x01ae, B:75:0x01c0, B:24:0x005a, B:56:0x011f, B:25:0x005f, B:28:0x0068, B:40:0x00a1, B:42:0x00a7, B:45:0x00c9, B:46:0x00dd, B:48:0x00e3, B:49:0x00f1, B:51:0x00f7, B:52:0x00fb, B:31:0x0073, B:37:0x008a, B:34:0x007a), top: B:86:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0176 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:17:0x0045, B:57:0x012c, B:59:0x0132, B:60:0x014c, B:62:0x0152, B:63:0x0170, B:65:0x0176, B:67:0x017e, B:71:0x0198, B:72:0x01a8, B:73:0x01ad, B:74:0x01ae, B:75:0x01c0, B:24:0x005a, B:56:0x011f, B:25:0x005f, B:28:0x0068, B:40:0x00a1, B:42:0x00a7, B:45:0x00c9, B:46:0x00dd, B:48:0x00e3, B:49:0x00f1, B:51:0x00f7, B:52:0x00fb, B:31:0x0073, B:37:0x008a, B:34:0x007a), top: B:86:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x017e A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:17:0x0045, B:57:0x012c, B:59:0x0132, B:60:0x014c, B:62:0x0152, B:63:0x0170, B:65:0x0176, B:67:0x017e, B:71:0x0198, B:72:0x01a8, B:73:0x01ad, B:74:0x01ae, B:75:0x01c0, B:24:0x005a, B:56:0x011f, B:25:0x005f, B:28:0x0068, B:40:0x00a1, B:42:0x00a7, B:45:0x00c9, B:46:0x00dd, B:48:0x00e3, B:49:0x00f1, B:51:0x00f7, B:52:0x00fb, B:31:0x0073, B:37:0x008a, B:34:0x007a), top: B:86:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0194  */
    /* JADX WARN: Code duplicated, block: B:70:0x0197  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r18v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.lingq.core.data.repository.e] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: g */
    public final java.lang.Object m7157g(int r25, java.lang.String r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.C1289e.m7157g(int, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: h */
    public final Object m7158h(String str, Integer num, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$fetchChatSuggestions$1 chatRepositoryImpl$fetchChatSuggestions$1;
        String str2;
        Integer num2;
        if (continuationImpl instanceof ChatRepositoryImpl$fetchChatSuggestions$1) {
            chatRepositoryImpl$fetchChatSuggestions$1 = (ChatRepositoryImpl$fetchChatSuggestions$1) continuationImpl;
            int i = chatRepositoryImpl$fetchChatSuggestions$1.f14907e;
            if ((i & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$fetchChatSuggestions$1.f14907e = i - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$fetchChatSuggestions$1 = new ChatRepositoryImpl$fetchChatSuggestions$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$fetchChatSuggestions$1 = new ChatRepositoryImpl$fetchChatSuggestions$1(this, continuationImpl);
        }
        Object objM25822k = chatRepositoryImpl$fetchChatSuggestions$1.f14905c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chatRepositoryImpl$fetchChatSuggestions$1.f14907e;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM25822k);
                zx0 zx0Var = this.f16470d;
                chatRepositoryImpl$fetchChatSuggestions$1.f14903a = str;
                chatRepositoryImpl$fetchChatSuggestions$1.f14904b = num;
                chatRepositoryImpl$fetchChatSuggestions$1.f14907e = 1;
                objM25822k = zx0Var.m25822k(str, num, chatRepositoryImpl$fetchChatSuggestions$1);
                if (objM25822k != coroutineSingletons) {
                    str2 = str;
                    num2 = num;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    AbstractC3193b.m15359b(objM25822k);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            num2 = chatRepositoryImpl$fetchChatSuggestions$1.f14904b;
            String str3 = chatRepositoryImpl$fetchChatSuggestions$1.f14903a;
            AbstractC3193b.m15359b(objM25822k);
            str2 = str3;
            ArrayList arrayList = new ArrayList();
            for (ResultChatSuggestion resultChatSuggestion : (Iterable) objM25822k) {
                resultChatSuggestion.getClass();
                String str4 = resultChatSuggestion.f20776b;
                oz0 oz0Var = vk9.m23391n0(str4) ? null : new oz0(resultChatSuggestion.f20775a, str4);
                if (oz0Var != null) {
                    arrayList.add(oz0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                C1315c c1315c = this.f16467a;
                int iIntValue = num2 != null ? num2.intValue() : 0;
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                int i3 = 0;
                for (Object obj : arrayList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    oz0 oz0Var2 = (oz0) obj;
                    arrayList2.add(new ChatSuggestionEntity(num2 != null ? num2.intValue() : 0, i3, str2, oz0Var2.f55316a, oz0Var2.f55317b));
                    i3 = i4;
                }
                chatRepositoryImpl$fetchChatSuggestions$1.f14903a = null;
                chatRepositoryImpl$fetchChatSuggestions$1.f14904b = null;
                chatRepositoryImpl$fetchChatSuggestions$1.f14907e = 2;
                if (c1315c.m7464y0(str2, iIntValue, arrayList2, chatRepositoryImpl$fetchChatSuggestions$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfaVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            rm5 rm5Var = sm5.Companion;
            String str5 = "ChatRepository: fetchChatSuggestions failed - " + e2.getMessage();
            rm5Var.getClass();
            h0a.f41641a.mo11433g(str5, new Object[0]);
            return xfaVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x027d  */
    /* JADX WARN: Code duplicated, block: B:116:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0190 A[Catch: Exception -> 0x0288, TryCatch #0 {Exception -> 0x0288, blocks: (B:16:0x0048, B:72:0x018a, B:74:0x0190, B:75:0x01a1, B:77:0x01a7, B:79:0x01be, B:80:0x01c2, B:81:0x01cf, B:83:0x01d5, B:84:0x01e3, B:88:0x020b, B:89:0x0218, B:91:0x021e, B:93:0x022c, B:103:0x0259, B:96:0x0236, B:97:0x023a, B:99:0x0240, B:104:0x025d, B:21:0x0064, B:24:0x0079, B:71:0x017d, B:27:0x008a, B:51:0x0116, B:53:0x011c, B:55:0x0122, B:56:0x0131, B:58:0x0137, B:60:0x0143, B:62:0x0151, B:67:0x015e, B:30:0x0093, B:36:0x00aa, B:38:0x00b6, B:40:0x00bc, B:41:0x00cb, B:43:0x00d1, B:47:0x00fc, B:33:0x009a), top: B:113:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01a7 A[Catch: Exception -> 0x0288, TryCatch #0 {Exception -> 0x0288, blocks: (B:16:0x0048, B:72:0x018a, B:74:0x0190, B:75:0x01a1, B:77:0x01a7, B:79:0x01be, B:80:0x01c2, B:81:0x01cf, B:83:0x01d5, B:84:0x01e3, B:88:0x020b, B:89:0x0218, B:91:0x021e, B:93:0x022c, B:103:0x0259, B:96:0x0236, B:97:0x023a, B:99:0x0240, B:104:0x025d, B:21:0x0064, B:24:0x0079, B:71:0x017d, B:27:0x008a, B:51:0x0116, B:53:0x011c, B:55:0x0122, B:56:0x0131, B:58:0x0137, B:60:0x0143, B:62:0x0151, B:67:0x015e, B:30:0x0093, B:36:0x00aa, B:38:0x00b6, B:40:0x00bc, B:41:0x00cb, B:43:0x00d1, B:47:0x00fc, B:33:0x009a), top: B:113:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d5 A[Catch: Exception -> 0x0288, LOOP:1: B:81:0x01cf->B:83:0x01d5, LOOP_END, TryCatch #0 {Exception -> 0x0288, blocks: (B:16:0x0048, B:72:0x018a, B:74:0x0190, B:75:0x01a1, B:77:0x01a7, B:79:0x01be, B:80:0x01c2, B:81:0x01cf, B:83:0x01d5, B:84:0x01e3, B:88:0x020b, B:89:0x0218, B:91:0x021e, B:93:0x022c, B:103:0x0259, B:96:0x0236, B:97:0x023a, B:99:0x0240, B:104:0x025d, B:21:0x0064, B:24:0x0079, B:71:0x017d, B:27:0x008a, B:51:0x0116, B:53:0x011c, B:55:0x0122, B:56:0x0131, B:58:0x0137, B:60:0x0143, B:62:0x0151, B:67:0x015e, B:30:0x0093, B:36:0x00aa, B:38:0x00b6, B:40:0x00bc, B:41:0x00cb, B:43:0x00d1, B:47:0x00fc, B:33:0x009a), top: B:113:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0203  */
    /* JADX WARN: Code duplicated, block: B:87:0x0205  */
    /* JADX WARN: Code duplicated, block: B:91:0x021e A[Catch: Exception -> 0x0288, TryCatch #0 {Exception -> 0x0288, blocks: (B:16:0x0048, B:72:0x018a, B:74:0x0190, B:75:0x01a1, B:77:0x01a7, B:79:0x01be, B:80:0x01c2, B:81:0x01cf, B:83:0x01d5, B:84:0x01e3, B:88:0x020b, B:89:0x0218, B:91:0x021e, B:93:0x022c, B:103:0x0259, B:96:0x0236, B:97:0x023a, B:99:0x0240, B:104:0x025d, B:21:0x0064, B:24:0x0079, B:71:0x017d, B:27:0x008a, B:51:0x0116, B:53:0x011c, B:55:0x0122, B:56:0x0131, B:58:0x0137, B:60:0x0143, B:62:0x0151, B:67:0x015e, B:30:0x0093, B:36:0x00aa, B:38:0x00b6, B:40:0x00bc, B:41:0x00cb, B:43:0x00d1, B:47:0x00fc, B:33:0x009a), top: B:113:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x022c A[Catch: Exception -> 0x0288, TryCatch #0 {Exception -> 0x0288, blocks: (B:16:0x0048, B:72:0x018a, B:74:0x0190, B:75:0x01a1, B:77:0x01a7, B:79:0x01be, B:80:0x01c2, B:81:0x01cf, B:83:0x01d5, B:84:0x01e3, B:88:0x020b, B:89:0x0218, B:91:0x021e, B:93:0x022c, B:103:0x0259, B:96:0x0236, B:97:0x023a, B:99:0x0240, B:104:0x025d, B:21:0x0064, B:24:0x0079, B:71:0x017d, B:27:0x008a, B:51:0x0116, B:53:0x011c, B:55:0x0122, B:56:0x0131, B:58:0x0137, B:60:0x0143, B:62:0x0151, B:67:0x015e, B:30:0x0093, B:36:0x00aa, B:38:0x00b6, B:40:0x00bc, B:41:0x00cb, B:43:0x00d1, B:47:0x00fc, B:33:0x009a), top: B:113:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0236 A[Catch: Exception -> 0x0288, TryCatch #0 {Exception -> 0x0288, blocks: (B:16:0x0048, B:72:0x018a, B:74:0x0190, B:75:0x01a1, B:77:0x01a7, B:79:0x01be, B:80:0x01c2, B:81:0x01cf, B:83:0x01d5, B:84:0x01e3, B:88:0x020b, B:89:0x0218, B:91:0x021e, B:93:0x022c, B:103:0x0259, B:96:0x0236, B:97:0x023a, B:99:0x0240, B:104:0x025d, B:21:0x0064, B:24:0x0079, B:71:0x017d, B:27:0x008a, B:51:0x0116, B:53:0x011c, B:55:0x0122, B:56:0x0131, B:58:0x0137, B:60:0x0143, B:62:0x0151, B:67:0x015e, B:30:0x0093, B:36:0x00aa, B:38:0x00b6, B:40:0x00bc, B:41:0x00cb, B:43:0x00d1, B:47:0x00fc, B:33:0x009a), top: B:113:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0240 A[Catch: Exception -> 0x0288, TryCatch #0 {Exception -> 0x0288, blocks: (B:16:0x0048, B:72:0x018a, B:74:0x0190, B:75:0x01a1, B:77:0x01a7, B:79:0x01be, B:80:0x01c2, B:81:0x01cf, B:83:0x01d5, B:84:0x01e3, B:88:0x020b, B:89:0x0218, B:91:0x021e, B:93:0x022c, B:103:0x0259, B:96:0x0236, B:97:0x023a, B:99:0x0240, B:104:0x025d, B:21:0x0064, B:24:0x0079, B:71:0x017d, B:27:0x008a, B:51:0x0116, B:53:0x011c, B:55:0x0122, B:56:0x0131, B:58:0x0137, B:60:0x0143, B:62:0x0151, B:67:0x015e, B:30:0x0093, B:36:0x00aa, B:38:0x00b6, B:40:0x00bc, B:41:0x00cb, B:43:0x00d1, B:47:0x00fc, B:33:0x009a), top: B:113:0x0032 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [un0] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x027d -> B:108:0x0282). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: i */
    public final java.lang.Object m7159i(int r18, java.lang.String r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.C1289e.m7159i(int, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00db A[Catch: Exception -> 0x020f, LOOP:2: B:43:0x00d5->B:45:0x00db, LOOP_END, TryCatch #0 {Exception -> 0x020f, blocks: (B:15:0x003f, B:88:0x01fe, B:20:0x0056, B:75:0x019b, B:76:0x01a7, B:78:0x01ad, B:80:0x01c3, B:81:0x01c7, B:82:0x01d4, B:84:0x01da, B:85:0x01e8, B:23:0x0065, B:42:0x00c3, B:43:0x00d5, B:45:0x00db, B:46:0x00ee, B:47:0x00fe, B:49:0x0104, B:51:0x011b, B:53:0x0120, B:54:0x012f, B:56:0x0135, B:57:0x0141, B:59:0x0147, B:64:0x015c, B:66:0x0160, B:68:0x016a, B:69:0x016e, B:70:0x017c, B:71:0x0183, B:26:0x0072, B:33:0x0090, B:35:0x0099, B:38:0x00a1, B:90:0x0208, B:29:0x0079), top: B:94:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0104 A[Catch: Exception -> 0x020f, TryCatch #0 {Exception -> 0x020f, blocks: (B:15:0x003f, B:88:0x01fe, B:20:0x0056, B:75:0x019b, B:76:0x01a7, B:78:0x01ad, B:80:0x01c3, B:81:0x01c7, B:82:0x01d4, B:84:0x01da, B:85:0x01e8, B:23:0x0065, B:42:0x00c3, B:43:0x00d5, B:45:0x00db, B:46:0x00ee, B:47:0x00fe, B:49:0x0104, B:51:0x011b, B:53:0x0120, B:54:0x012f, B:56:0x0135, B:57:0x0141, B:59:0x0147, B:64:0x015c, B:66:0x0160, B:68:0x016a, B:69:0x016e, B:70:0x017c, B:71:0x0183, B:26:0x0072, B:33:0x0090, B:35:0x0099, B:38:0x00a1, B:90:0x0208, B:29:0x0079), top: B:94:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[Catch: Exception -> 0x020f, TryCatch #0 {Exception -> 0x020f, blocks: (B:15:0x003f, B:88:0x01fe, B:20:0x0056, B:75:0x019b, B:76:0x01a7, B:78:0x01ad, B:80:0x01c3, B:81:0x01c7, B:82:0x01d4, B:84:0x01da, B:85:0x01e8, B:23:0x0065, B:42:0x00c3, B:43:0x00d5, B:45:0x00db, B:46:0x00ee, B:47:0x00fe, B:49:0x0104, B:51:0x011b, B:53:0x0120, B:54:0x012f, B:56:0x0135, B:57:0x0141, B:59:0x0147, B:64:0x015c, B:66:0x0160, B:68:0x016a, B:69:0x016e, B:70:0x017c, B:71:0x0183, B:26:0x0072, B:33:0x0090, B:35:0x0099, B:38:0x00a1, B:90:0x0208, B:29:0x0079), top: B:94:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0135 A[Catch: Exception -> 0x020f, TryCatch #0 {Exception -> 0x020f, blocks: (B:15:0x003f, B:88:0x01fe, B:20:0x0056, B:75:0x019b, B:76:0x01a7, B:78:0x01ad, B:80:0x01c3, B:81:0x01c7, B:82:0x01d4, B:84:0x01da, B:85:0x01e8, B:23:0x0065, B:42:0x00c3, B:43:0x00d5, B:45:0x00db, B:46:0x00ee, B:47:0x00fe, B:49:0x0104, B:51:0x011b, B:53:0x0120, B:54:0x012f, B:56:0x0135, B:57:0x0141, B:59:0x0147, B:64:0x015c, B:66:0x0160, B:68:0x016a, B:69:0x016e, B:70:0x017c, B:71:0x0183, B:26:0x0072, B:33:0x0090, B:35:0x0099, B:38:0x00a1, B:90:0x0208, B:29:0x0079), top: B:94:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0147 A[Catch: Exception -> 0x020f, TryCatch #0 {Exception -> 0x020f, blocks: (B:15:0x003f, B:88:0x01fe, B:20:0x0056, B:75:0x019b, B:76:0x01a7, B:78:0x01ad, B:80:0x01c3, B:81:0x01c7, B:82:0x01d4, B:84:0x01da, B:85:0x01e8, B:23:0x0065, B:42:0x00c3, B:43:0x00d5, B:45:0x00db, B:46:0x00ee, B:47:0x00fe, B:49:0x0104, B:51:0x011b, B:53:0x0120, B:54:0x012f, B:56:0x0135, B:57:0x0141, B:59:0x0147, B:64:0x015c, B:66:0x0160, B:68:0x016a, B:69:0x016e, B:70:0x017c, B:71:0x0183, B:26:0x0072, B:33:0x0090, B:35:0x0099, B:38:0x00a1, B:90:0x0208, B:29:0x0079), top: B:94:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0160 A[Catch: Exception -> 0x020f, TryCatch #0 {Exception -> 0x020f, blocks: (B:15:0x003f, B:88:0x01fe, B:20:0x0056, B:75:0x019b, B:76:0x01a7, B:78:0x01ad, B:80:0x01c3, B:81:0x01c7, B:82:0x01d4, B:84:0x01da, B:85:0x01e8, B:23:0x0065, B:42:0x00c3, B:43:0x00d5, B:45:0x00db, B:46:0x00ee, B:47:0x00fe, B:49:0x0104, B:51:0x011b, B:53:0x0120, B:54:0x012f, B:56:0x0135, B:57:0x0141, B:59:0x0147, B:64:0x015c, B:66:0x0160, B:68:0x016a, B:69:0x016e, B:70:0x017c, B:71:0x0183, B:26:0x0072, B:33:0x0090, B:35:0x0099, B:38:0x00a1, B:90:0x0208, B:29:0x0079), top: B:94:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:68:0x016a A[Catch: Exception -> 0x020f, TryCatch #0 {Exception -> 0x020f, blocks: (B:15:0x003f, B:88:0x01fe, B:20:0x0056, B:75:0x019b, B:76:0x01a7, B:78:0x01ad, B:80:0x01c3, B:81:0x01c7, B:82:0x01d4, B:84:0x01da, B:85:0x01e8, B:23:0x0065, B:42:0x00c3, B:43:0x00d5, B:45:0x00db, B:46:0x00ee, B:47:0x00fe, B:49:0x0104, B:51:0x011b, B:53:0x0120, B:54:0x012f, B:56:0x0135, B:57:0x0141, B:59:0x0147, B:64:0x015c, B:66:0x0160, B:68:0x016a, B:69:0x016e, B:70:0x017c, B:71:0x0183, B:26:0x0072, B:33:0x0090, B:35:0x0099, B:38:0x00a1, B:90:0x0208, B:29:0x0079), top: B:94:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0199  */
    /* JADX WARN: Code duplicated, block: B:74:0x019a  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ad A[Catch: Exception -> 0x020f, TryCatch #0 {Exception -> 0x020f, blocks: (B:15:0x003f, B:88:0x01fe, B:20:0x0056, B:75:0x019b, B:76:0x01a7, B:78:0x01ad, B:80:0x01c3, B:81:0x01c7, B:82:0x01d4, B:84:0x01da, B:85:0x01e8, B:23:0x0065, B:42:0x00c3, B:43:0x00d5, B:45:0x00db, B:46:0x00ee, B:47:0x00fe, B:49:0x0104, B:51:0x011b, B:53:0x0120, B:54:0x012f, B:56:0x0135, B:57:0x0141, B:59:0x0147, B:64:0x015c, B:66:0x0160, B:68:0x016a, B:69:0x016e, B:70:0x017c, B:71:0x0183, B:26:0x0072, B:33:0x0090, B:35:0x0099, B:38:0x00a1, B:90:0x0208, B:29:0x0079), top: B:94:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:84:0x01da A[Catch: Exception -> 0x020f, LOOP:1: B:82:0x01d4->B:84:0x01da, LOOP_END, TryCatch #0 {Exception -> 0x020f, blocks: (B:15:0x003f, B:88:0x01fe, B:20:0x0056, B:75:0x019b, B:76:0x01a7, B:78:0x01ad, B:80:0x01c3, B:81:0x01c7, B:82:0x01d4, B:84:0x01da, B:85:0x01e8, B:23:0x0065, B:42:0x00c3, B:43:0x00d5, B:45:0x00db, B:46:0x00ee, B:47:0x00fe, B:49:0x0104, B:51:0x011b, B:53:0x0120, B:54:0x012f, B:56:0x0135, B:57:0x0141, B:59:0x0147, B:64:0x015c, B:66:0x0160, B:68:0x016a, B:69:0x016e, B:70:0x017c, B:71:0x0183, B:26:0x0072, B:33:0x0090, B:35:0x0099, B:38:0x00a1, B:90:0x0208, B:29:0x0079), top: B:94:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fb, code lost:
    
        if (r11.mo4096w0(r1, r3) == r4) goto L87;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7160j(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$fetchChats$1 chatRepositoryImpl$fetchChats$1;
        String str3;
        String str4;
        List list;
        ArrayList arrayList;
        Iterator it;
        Set setM22627s1;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str5;
        Iterator it2;
        Object next;
        ResultChatOld resultChatOld;
        String strM8352c;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Iterator it3;
        String str6 = str;
        if (continuationImpl instanceof ChatRepositoryImpl$fetchChats$1) {
            chatRepositoryImpl$fetchChats$1 = (ChatRepositoryImpl$fetchChats$1) continuationImpl;
            int i = chatRepositoryImpl$fetchChats$1.f14926g;
            if ((i & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$fetchChats$1.f14926g = i - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$fetchChats$1 = new ChatRepositoryImpl$fetchChats$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$fetchChats$1 = new ChatRepositoryImpl$fetchChats$1(this, continuationImpl);
        }
        Object obj = chatRepositoryImpl$fetchChats$1.f14924e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chatRepositoryImpl$fetchChats$1.f14926g;
        C1315c c1315c = this.f16467a;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                zx0 zx0Var = this.f16470d;
                chatRepositoryImpl$fetchChats$1.f14920a = str6;
                chatRepositoryImpl$fetchChats$1.f14921b = str2;
                chatRepositoryImpl$fetchChats$1.f14926g = 1;
                Object objM25833v = zx0Var.m25833v(str6, chatRepositoryImpl$fetchChats$1);
                if (objM25833v != coroutineSingletons) {
                    obj = objM25833v;
                    str3 = str2;
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                str3 = chatRepositoryImpl$fetchChats$1.f14921b;
                str6 = chatRepositoryImpl$fetchChats$1.f14920a;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i2 == 2) {
                    list = chatRepositoryImpl$fetchChats$1.f14922c;
                    String str7 = chatRepositoryImpl$fetchChats$1.f14921b;
                    String str8 = chatRepositoryImpl$fetchChats$1.f14920a;
                    AbstractC3193b.m15359b(obj);
                    str4 = str7;
                    str6 = str8;
                    List list2 = (List) obj;
                    List list3 = list2;
                    arrayList = new ArrayList(v91.m23189q0(list3, 10));
                    it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Integer(((ChatHistoryEntity) it.next()).m7562e()));
                    }
                    setM22627s1 = u91.m22627s1(arrayList);
                    arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (setM22627s1.contains(new Integer(((ResultChatOld) obj2).m8350a()))) {
                            arrayList2.add(obj2);
                        }
                    }
                    List<ChatHistoryEntity> list4 = list2;
                    arrayList3 = new ArrayList(v91.m23189q0(list4, 10));
                    for (ChatHistoryEntity chatHistoryEntityM7558a : list4) {
                        it2 = arrayList2.iterator();
                        do {
                            if (it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (((ResultChatOld) next).m8350a() != chatHistoryEntityM7558a.m7562e());
                        resultChatOld = (ResultChatOld) next;
                        if (resultChatOld != null) {
                            String strM8351b = resultChatOld.m8351b();
                            strM8352c = resultChatOld.m8352c();
                            if (strM8352c == null) {
                                strM8352c = chatHistoryEntityM7558a.m7566i();
                            }
                            chatHistoryEntityM7558a = ChatHistoryEntity.m7558a(chatHistoryEntityM7558a, strM8352c, null, null, strM8351b, null, 445);
                        }
                        arrayList3.add(chatHistoryEntityM7558a);
                    }
                    chatRepositoryImpl$fetchChats$1.f14920a = str6;
                    chatRepositoryImpl$fetchChats$1.f14921b = str4;
                    chatRepositoryImpl$fetchChats$1.f14922c = list;
                    chatRepositoryImpl$fetchChats$1.f14923d = setM22627s1;
                    chatRepositoryImpl$fetchChats$1.f14926g = 3;
                    if (c1315c.mo4096w0(arrayList3, chatRepositoryImpl$fetchChats$1) == coroutineSingletons) {
                        str5 = str6;
                        arrayList4 = new ArrayList();
                        for (Object obj3 : list) {
                            if (!setM22627s1.contains(new Integer(((ResultChatOld) obj3).m8350a()))) {
                                arrayList4.add(obj3);
                            }
                        }
                        arrayList5 = new ArrayList(v91.m23189q0(arrayList4, 10));
                        it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(fqc.m12000a((ResultChatOld) it3.next(), str5, str4));
                        }
                        chatRepositoryImpl$fetchChats$1.f14920a = null;
                        chatRepositoryImpl$fetchChats$1.f14921b = null;
                        chatRepositoryImpl$fetchChats$1.f14922c = list;
                        chatRepositoryImpl$fetchChats$1.f14923d = null;
                        chatRepositoryImpl$fetchChats$1.f14926g = 4;
                    }
                    return coroutineSingletons;
                }
                if (i2 == 3) {
                    Set set = chatRepositoryImpl$fetchChats$1.f14923d;
                    List list5 = chatRepositoryImpl$fetchChats$1.f14922c;
                    str4 = chatRepositoryImpl$fetchChats$1.f14921b;
                    str5 = chatRepositoryImpl$fetchChats$1.f14920a;
                    AbstractC3193b.m15359b(obj);
                    setM22627s1 = set;
                    list = list5;
                    arrayList4 = new ArrayList();
                    while (r1.hasNext()) {
                        if (!setM22627s1.contains(new Integer(((ResultChatOld) obj3).m8350a()))) {
                            arrayList4.add(obj3);
                        }
                    }
                    arrayList5 = new ArrayList(v91.m23189q0(arrayList4, 10));
                    it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(fqc.m12000a((ResultChatOld) it3.next(), str5, str4));
                    }
                    chatRepositoryImpl$fetchChats$1.f14920a = null;
                    chatRepositoryImpl$fetchChats$1.f14921b = null;
                    chatRepositoryImpl$fetchChats$1.f14922c = list;
                    chatRepositoryImpl$fetchChats$1.f14923d = null;
                    chatRepositoryImpl$fetchChats$1.f14926g = 4;
                } else {
                    if (i2 != 4) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Set set2 = chatRepositoryImpl$fetchChats$1.f14923d;
                    list = chatRepositoryImpl$fetchChats$1.f14922c;
                    AbstractC3193b.m15359b(obj);
                }
            }
            return new Integer(list.size());
            List list6 = ((Results) obj).f21739d;
            List list7 = list6;
            if (list7 != null && !list7.isEmpty()) {
                chatRepositoryImpl$fetchChats$1.f14920a = str6;
                chatRepositoryImpl$fetchChats$1.f14921b = str3;
                chatRepositoryImpl$fetchChats$1.f14922c = list6;
                chatRepositoryImpl$fetchChats$1.f14926g = 2;
                Object objM2861d = AbstractC0758a.m2861d(new s70(17, str6, c1315c), c1315c.f17001K, chatRepositoryImpl$fetchChats$1, true, true);
                if (objM2861d != coroutineSingletons) {
                    str4 = str3;
                    list = list6;
                    obj = objM2861d;
                    List list8 = (List) obj;
                    List list9 = list8;
                    arrayList = new ArrayList(v91.m23189q0(list9, 10));
                    it = list9.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Integer(((ChatHistoryEntity) it.next()).m7562e()));
                    }
                    setM22627s1 = u91.m22627s1(arrayList);
                    arrayList2 = new ArrayList();
                    while (r12.hasNext()) {
                        if (setM22627s1.contains(new Integer(((ResultChatOld) obj2).m8350a()))) {
                            arrayList2.add(obj2);
                        }
                    }
                    List<ChatHistoryEntity> list10 = list8;
                    arrayList3 = new ArrayList(v91.m23189q0(list10, 10));
                    while (r2.hasNext()) {
                        it2 = arrayList2.iterator();
                        do {
                            if (it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (((ResultChatOld) next).m8350a() != chatHistoryEntityM7558a.m7562e());
                        resultChatOld = (ResultChatOld) next;
                        if (resultChatOld != null) {
                            String strM8351b2 = resultChatOld.m8351b();
                            strM8352c = resultChatOld.m8352c();
                            if (strM8352c == null) {
                                strM8352c = chatHistoryEntityM7558a.m7566i();
                            }
                            chatHistoryEntityM7558a = ChatHistoryEntity.m7558a(chatHistoryEntityM7558a, strM8352c, null, null, strM8351b2, null, 445);
                        }
                        arrayList3.add(chatHistoryEntityM7558a);
                    }
                    chatRepositoryImpl$fetchChats$1.f14920a = str6;
                    chatRepositoryImpl$fetchChats$1.f14921b = str4;
                    chatRepositoryImpl$fetchChats$1.f14922c = list;
                    chatRepositoryImpl$fetchChats$1.f14923d = setM22627s1;
                    chatRepositoryImpl$fetchChats$1.f14926g = 3;
                    if (c1315c.mo4096w0(arrayList3, chatRepositoryImpl$fetchChats$1) == coroutineSingletons) {
                        str5 = str6;
                        arrayList4 = new ArrayList();
                        while (r1.hasNext()) {
                            if (!setM22627s1.contains(new Integer(((ResultChatOld) obj3).m8350a()))) {
                                arrayList4.add(obj3);
                            }
                        }
                        arrayList5 = new ArrayList(v91.m23189q0(arrayList4, 10));
                        it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(fqc.m12000a((ResultChatOld) it3.next(), str5, str4));
                        }
                        chatRepositoryImpl$fetchChats$1.f14920a = null;
                        chatRepositoryImpl$fetchChats$1.f14921b = null;
                        chatRepositoryImpl$fetchChats$1.f14922c = list;
                        chatRepositoryImpl$fetchChats$1.f14923d = null;
                        chatRepositoryImpl$fetchChats$1.f14926g = 4;
                    }
                }
                return coroutineSingletons;
            }
            return new Integer(-1);
        } catch (Exception unused) {
            return new Integer(-1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m7161k(String str, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$fetchLynxPrivacySettings$1 chatRepositoryImpl$fetchLynxPrivacySettings$1;
        Object failure;
        Boolean bool;
        Boolean bool2;
        Object failure2;
        Boolean bool3;
        if (continuationImpl instanceof ChatRepositoryImpl$fetchLynxPrivacySettings$1) {
            chatRepositoryImpl$fetchLynxPrivacySettings$1 = (ChatRepositoryImpl$fetchLynxPrivacySettings$1) continuationImpl;
            int i = chatRepositoryImpl$fetchLynxPrivacySettings$1.f14931e;
            if ((i & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$fetchLynxPrivacySettings$1.f14931e = i - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$fetchLynxPrivacySettings$1 = new ChatRepositoryImpl$fetchLynxPrivacySettings$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$fetchLynxPrivacySettings$1 = new ChatRepositoryImpl$fetchLynxPrivacySettings$1(this, continuationImpl);
        }
        Object objM25823l = chatRepositoryImpl$fetchLynxPrivacySettings$1.f14929c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chatRepositoryImpl$fetchLynxPrivacySettings$1.f14931e;
        zx0 zx0Var = this.f16470d;
        try {
            try {
                if (i2 == 0) {
                    AbstractC3193b.m15359b(objM25823l);
                    chatRepositoryImpl$fetchLynxPrivacySettings$1.f14927a = str;
                    chatRepositoryImpl$fetchLynxPrivacySettings$1.f14928b = null;
                    chatRepositoryImpl$fetchLynxPrivacySettings$1.f14931e = 1;
                    objM25823l = zx0Var.m25823l(str, chatRepositoryImpl$fetchLynxPrivacySettings$1);
                    if (objM25823l == coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bool2 = chatRepositoryImpl$fetchLynxPrivacySettings$1.f14928b;
                    try {
                        AbstractC3193b.m15359b(objM25823l);
                        failure2 = Boolean.valueOf(((ResultChatDataUsage) objM25823l).m8337a());
                    } catch (Throwable th) {
                        th = th;
                        failure2 = new Result.Failure(th);
                    }
                    bool3 = (Boolean) (failure2 instanceof Result.Failure ? null : failure2);
                    if (bool2 == null || bool3 != null) {
                        return new xm5(new rn5(bool2, bool3));
                    }
                    sm5.Companion.getClass();
                    h0a.f41641a.mo11433g("ChatRepository: fetchLynxPrivacySettings failed for both settings", new Object[0]);
                    return new um5(zj6.f71653a);
                }
                str = chatRepositoryImpl$fetchLynxPrivacySettings$1.f14927a;
                AbstractC3193b.m15359b(objM25823l);
                chatRepositoryImpl$fetchLynxPrivacySettings$1.f14927a = null;
                chatRepositoryImpl$fetchLynxPrivacySettings$1.f14928b = bool;
                chatRepositoryImpl$fetchLynxPrivacySettings$1.f14931e = 2;
                Object objM25829r = zx0Var.m25829r(str, chatRepositoryImpl$fetchLynxPrivacySettings$1);
                if (objM25829r != coroutineSingletons) {
                    objM25823l = objM25829r;
                    bool2 = bool;
                    failure2 = Boolean.valueOf(((ResultChatDataUsage) objM25823l).m8337a());
                    bool3 = (Boolean) (failure2 instanceof Result.Failure ? null : failure2);
                    if (bool2 == null) {
                    }
                    return new xm5(new rn5(bool2, bool3));
                }
                return coroutineSingletons;
            } catch (Throwable th2) {
                th = th2;
                bool2 = bool;
                failure2 = new Result.Failure(th);
            }
            failure = Boolean.valueOf(((ResultChatMemory) objM25823l).m8344a());
        } catch (Throwable th3) {
            failure = new Result.Failure(th3);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        bool = (Boolean) failure;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0098 A[Catch: Exception -> 0x00c9, LOOP:0: B:35:0x0092->B:37:0x0098, LOOP_END, TryCatch #0 {Exception -> 0x00c9, blocks: (B:13:0x002f, B:18:0x003d, B:34:0x007b, B:35:0x0092, B:37:0x0098, B:38:0x00a6, B:21:0x0047, B:27:0x0064, B:30:0x0069, B:24:0x004e), top: B:46:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m7162l(int i, int i2, String str, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$fetchPhraseSuggestionsForMessage$1 chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1;
        int i3;
        ArrayList arrayList;
        Iterator it;
        Object objM2861d;
        if (continuationImpl instanceof ChatRepositoryImpl$fetchPhraseSuggestionsForMessage$1) {
            chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1 = (ChatRepositoryImpl$fetchPhraseSuggestionsForMessage$1) continuationImpl;
            int i4 = chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14937f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14937f = i4 - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1 = new ChatRepositoryImpl$fetchPhraseSuggestionsForMessage$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1 = new ChatRepositoryImpl$fetchPhraseSuggestionsForMessage$1(this, continuationImpl);
        }
        Object objM2861d2 = chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14935d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14937f;
        int i6 = 0;
        C1315c c1315c = this.f16467a;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i5 == 0) {
                AbstractC3193b.m15359b(objM2861d2);
                chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14932a = str;
                chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14933b = i;
                chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14934c = i2;
                chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14937f = 1;
                objM2861d2 = AbstractC0758a.m2861d(new nv0(i, i2, c1315c, i6), c1315c.f17001K, chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1, true, true);
                if (objM2861d2 == coroutineSingletons) {
                }
            }
            if (i5 == 1) {
                i2 = chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14934c;
                i = chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14933b;
                str = chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14932a;
                AbstractC3193b.m15359b(objM2861d2);
            } else {
                if (i5 != 2) {
                    if (i5 == 3) {
                        AbstractC3193b.m15359b(objM2861d2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14934c;
                i = chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14933b;
                AbstractC3193b.m15359b(objM2861d2);
            }
            List listM8380a = ((ResultPhrases) objM2861d2).m8380a();
            arrayList = new ArrayList(v91.m23189q0(listM8380a, 10));
            it = listM8380a.iterator();
            while (it.hasNext()) {
                arrayList.add(fqc.m12003d((ResultChatPhrase) it.next()));
            }
            ow0 ow0Var = new ow0(arrayList, i, i3);
            chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14932a = null;
            chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14933b = i;
            chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14934c = i3;
            chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14937f = 3;
            objM2861d = AbstractC0758a.m2861d(new s70(14, c1315c, ow0Var), c1315c.f17001K, chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1, false, true);
            if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM2861d = xfaVar;
            }
            return objM2861d == coroutineSingletons ? coroutineSingletons : xfaVar;
            if (((ChatMessagePhrases) objM2861d2) == null) {
                zx0 zx0Var = this.f16470d;
                chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14932a = null;
                chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14933b = i;
                chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14934c = i2;
                chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14937f = 2;
                objM2861d2 = zx0Var.m25828q(str, i, i2, chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1);
                if (objM2861d2 != coroutineSingletons) {
                    i3 = i2;
                    List listM8380a2 = ((ResultPhrases) objM2861d2).m8380a();
                    arrayList = new ArrayList(v91.m23189q0(listM8380a2, 10));
                    it = listM8380a2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(fqc.m12003d((ResultChatPhrase) it.next()));
                    }
                    ow0 ow0Var2 = new ow0(arrayList, i, i3);
                    chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14932a = null;
                    chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14933b = i;
                    chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14934c = i3;
                    chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1.f14937f = 3;
                    objM2861d = AbstractC0758a.m2861d(new s70(14, c1315c, ow0Var2), c1315c.f17001K, chatRepositoryImpl$fetchPhraseSuggestionsForMessage$1, false, true);
                    if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM2861d = xfaVar;
                    }
                    if (objM2861d == coroutineSingletons) {
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m7163m(int i, int i2, String str, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$fetchTranslationForMessage$1 chatRepositoryImpl$fetchTranslationForMessage$1;
        int i3;
        Object objM2861d;
        if (continuationImpl instanceof ChatRepositoryImpl$fetchTranslationForMessage$1) {
            chatRepositoryImpl$fetchTranslationForMessage$1 = (ChatRepositoryImpl$fetchTranslationForMessage$1) continuationImpl;
            int i4 = chatRepositoryImpl$fetchTranslationForMessage$1.f14943f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$fetchTranslationForMessage$1.f14943f = i4 - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$fetchTranslationForMessage$1 = new ChatRepositoryImpl$fetchTranslationForMessage$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$fetchTranslationForMessage$1 = new ChatRepositoryImpl$fetchTranslationForMessage$1(this, continuationImpl);
        }
        Object objM2861d2 = chatRepositoryImpl$fetchTranslationForMessage$1.f14941d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = chatRepositoryImpl$fetchTranslationForMessage$1.f14943f;
        int i6 = 0;
        C1315c c1315c = this.f16467a;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i5 == 0) {
                AbstractC3193b.m15359b(objM2861d2);
                chatRepositoryImpl$fetchTranslationForMessage$1.f14938a = str;
                chatRepositoryImpl$fetchTranslationForMessage$1.f14939b = i;
                chatRepositoryImpl$fetchTranslationForMessage$1.f14940c = i2;
                chatRepositoryImpl$fetchTranslationForMessage$1.f14943f = 1;
                objM2861d2 = AbstractC0758a.m2861d(new rv0(i, i2, i6), c1315c.f17001K, chatRepositoryImpl$fetchTranslationForMessage$1, true, true);
                if (objM2861d2 == coroutineSingletons) {
                }
            }
            if (i5 == 1) {
                i2 = chatRepositoryImpl$fetchTranslationForMessage$1.f14940c;
                i = chatRepositoryImpl$fetchTranslationForMessage$1.f14939b;
                str = chatRepositoryImpl$fetchTranslationForMessage$1.f14938a;
                AbstractC3193b.m15359b(objM2861d2);
            } else {
                if (i5 != 2) {
                    if (i5 == 3) {
                        AbstractC3193b.m15359b(objM2861d2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = chatRepositoryImpl$fetchTranslationForMessage$1.f14940c;
                i = chatRepositoryImpl$fetchTranslationForMessage$1.f14939b;
                AbstractC3193b.m15359b(objM2861d2);
            }
            qw0 qw0Var = new qw0(i, ((ResultTranslationChat) objM2861d2).m8395a(), i3);
            chatRepositoryImpl$fetchTranslationForMessage$1.f14938a = null;
            chatRepositoryImpl$fetchTranslationForMessage$1.f14939b = i;
            chatRepositoryImpl$fetchTranslationForMessage$1.f14940c = i3;
            chatRepositoryImpl$fetchTranslationForMessage$1.f14943f = 3;
            objM2861d = AbstractC0758a.m2861d(new s70(11, c1315c, qw0Var), c1315c.f17001K, chatRepositoryImpl$fetchTranslationForMessage$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            return objM2861d == coroutineSingletons ? coroutineSingletons : xfaVar;
            if (((ChatMessageTranslation) objM2861d2) == null) {
                zx0 zx0Var = this.f16470d;
                chatRepositoryImpl$fetchTranslationForMessage$1.f14938a = null;
                chatRepositoryImpl$fetchTranslationForMessage$1.f14939b = i;
                chatRepositoryImpl$fetchTranslationForMessage$1.f14940c = i2;
                chatRepositoryImpl$fetchTranslationForMessage$1.f14943f = 2;
                objM2861d2 = zx0Var.m25817f(str, i, i2, chatRepositoryImpl$fetchTranslationForMessage$1);
                if (objM2861d2 != coroutineSingletons) {
                    i3 = i2;
                    qw0 qw0Var2 = new qw0(i, ((ResultTranslationChat) objM2861d2).m8395a(), i3);
                    chatRepositoryImpl$fetchTranslationForMessage$1.f14938a = null;
                    chatRepositoryImpl$fetchTranslationForMessage$1.f14939b = i;
                    chatRepositoryImpl$fetchTranslationForMessage$1.f14940c = i3;
                    chatRepositoryImpl$fetchTranslationForMessage$1.f14943f = 3;
                    objM2861d = AbstractC0758a.m2861d(new s70(11, c1315c, qw0Var2), c1315c.f17001K, chatRepositoryImpl$fetchTranslationForMessage$1, false, true);
                    if (objM2861d != coroutineSingletons) {
                        objM2861d = xfaVar;
                    }
                    if (objM2861d == coroutineSingletons) {
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m7164n(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$getChatModelConfig$1 chatRepositoryImpl$getChatModelConfig$1;
        if (continuationImpl instanceof ChatRepositoryImpl$getChatModelConfig$1) {
            chatRepositoryImpl$getChatModelConfig$1 = (ChatRepositoryImpl$getChatModelConfig$1) continuationImpl;
            int i2 = chatRepositoryImpl$getChatModelConfig$1.f14947d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$getChatModelConfig$1.f14947d = i2 - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$getChatModelConfig$1 = new ChatRepositoryImpl$getChatModelConfig$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$getChatModelConfig$1 = new ChatRepositoryImpl$getChatModelConfig$1(this, continuationImpl);
        }
        Object objM25820i = chatRepositoryImpl$getChatModelConfig$1.f14945b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = chatRepositoryImpl$getChatModelConfig$1.f14947d;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM25820i);
                zx0 zx0Var = this.f16470d;
                chatRepositoryImpl$getChatModelConfig$1.f14944a = this;
                chatRepositoryImpl$getChatModelConfig$1.f14947d = 1;
                objM25820i = zx0Var.m25820i(str, i, chatRepositoryImpl$getChatModelConfig$1);
                if (objM25820i == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = chatRepositoryImpl$getChatModelConfig$1.f14944a;
                AbstractC3193b.m15359b(objM25820i);
            }
            ResultChatModelConfig resultChatModelConfig = (ResultChatModelConfig) objM25820i;
            this.getClass();
            dn5 dn5Var = LynxChatModel.Companion;
            String strM8348a = resultChatModelConfig.m8348a();
            dn5Var.getClass();
            LynxChatModel lynxChatModelM10491a = dn5.m10491a(strM8348a);
            un5 un5Var = LynxReasoningEffort.Companion;
            String strM8349b = resultChatModelConfig.m8349b();
            un5Var.getClass();
            return new xm5(new nn5(lynxChatModelM10491a, un5.m22838a(strM8349b)));
        } catch (Exception e) {
            rm5 rm5Var = sm5.Companion;
            String str2 = "ChatRepository: getChatModelConfig failed - " + e.getMessage();
            rm5Var.getClass();
            h0a.f41641a.mo11433g(str2, new Object[0]);
            return new um5(zj6.f71653a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m7165o(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$importChat$1 chatRepositoryImpl$importChat$1;
        ResultLesson resultLesson;
        if (continuationImpl instanceof ChatRepositoryImpl$importChat$1) {
            chatRepositoryImpl$importChat$1 = (ChatRepositoryImpl$importChat$1) continuationImpl;
            int i2 = chatRepositoryImpl$importChat$1.f14952e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$importChat$1.f14952e = i2 - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$importChat$1 = new ChatRepositoryImpl$importChat$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$importChat$1 = new ChatRepositoryImpl$importChat$1(this, continuationImpl);
        }
        Object objM25813b = chatRepositoryImpl$importChat$1.f14950c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = chatRepositoryImpl$importChat$1.f14952e;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM25813b);
                zx0 zx0Var = this.f16470d;
                chatRepositoryImpl$importChat$1.f14949b = i;
                chatRepositoryImpl$importChat$1.f14952e = 1;
                objM25813b = zx0Var.m25813b(str, i, chatRepositoryImpl$importChat$1);
                if (objM25813b == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 == 1) {
                i = chatRepositoryImpl$importChat$1.f14949b;
                AbstractC3193b.m15359b(objM25813b);
            } else {
                if (i3 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                resultLesson = chatRepositoryImpl$importChat$1.f14948a;
                AbstractC3193b.m15359b(objM25813b);
            }
            return new Integer(resultLesson.m8364b());
            ResultLesson resultLesson2 = (ResultLesson) objM25813b;
            if (resultLesson2 != null) {
                C1315c c1315c = this.f16467a;
                mw0 mw0Var = new mw0(i, resultLesson2.m8364b());
                chatRepositoryImpl$importChat$1.f14948a = resultLesson2;
                chatRepositoryImpl$importChat$1.f14949b = i;
                chatRepositoryImpl$importChat$1.f14952e = 2;
                Object objM2861d = AbstractC0758a.m2861d(new s70(16, c1315c, mw0Var), c1315c.f17001K, chatRepositoryImpl$importChat$1, false, true);
                if (objM2861d != coroutineSingletons) {
                    objM2861d = xfa.f68157a;
                }
                if (objM2861d != coroutineSingletons) {
                    resultLesson = resultLesson2;
                    return new Integer(resultLesson.m8364b());
                }
                return coroutineSingletons;
            }
        } catch (Exception unused) {
        }
        return new Integer(-1);
    }

    /* JADX INFO: renamed from: p */
    public final c83 m7166p(int i) {
        C1315c c1315c = this.f16467a;
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1315c.f17001K, false, new String[]{"ChatHistoryEntity"}, new qv0(i, c1315c, 0)));
    }

    /* JADX INFO: renamed from: q */
    public final eu0 m7167q(ul0 ul0Var, String str, String str2, Integer num) {
        return AbstractC3224d.m15528g(new ChatRepositoryImpl$processStreamResponse$1(num, ul0Var, this, str, str2, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: r */
    public final Object m7168r(String str, int i, int i2, ChatMessageRating chatMessageRating, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$rateMessage$1 chatRepositoryImpl$rateMessage$1;
        if (continuationImpl instanceof ChatRepositoryImpl$rateMessage$1) {
            chatRepositoryImpl$rateMessage$1 = (ChatRepositoryImpl$rateMessage$1) continuationImpl;
            int i3 = chatRepositoryImpl$rateMessage$1.f14989c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$rateMessage$1.f14989c = i3 - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$rateMessage$1 = new ChatRepositoryImpl$rateMessage$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$rateMessage$1 = new ChatRepositoryImpl$rateMessage$1(this, continuationImpl);
        }
        ChatRepositoryImpl$rateMessage$1 chatRepositoryImpl$rateMessage$2 = chatRepositoryImpl$rateMessage$1;
        Object objM25831t = chatRepositoryImpl$rateMessage$2.f14987a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = chatRepositoryImpl$rateMessage$2.f14989c;
        zj6 zj6Var = zj6.f71653a;
        try {
            if (i4 == 0) {
                AbstractC3193b.m15359b(objM25831t);
                zx0 zx0Var = this.f16470d;
                RequestChatMessageRating requestChatMessageRating = new RequestChatMessageRating(chatMessageRating.getValue());
                chatRepositoryImpl$rateMessage$2.f14989c = 1;
                objM25831t = zx0Var.m25831t(str, i, i2, requestChatMessageRating, chatRepositoryImpl$rateMessage$2);
                if (objM25831t == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i4 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM25831t);
            }
            pw0 pw0Var = ChatMessageRating.Companion;
            String strM8347a = ((ResultChatMessageRating) objM25831t).m8347a();
            pw0Var.getClass();
            ChatMessageRating chatMessageRatingM19535a = pw0.m19535a(strM8347a);
            return chatMessageRatingM19535a != null ? new xm5(chatMessageRatingM19535a) : new um5(zj6Var);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            rm5 rm5Var = sm5.Companion;
            String str2 = "ChatRepository: rateMessage failed - " + e2.getMessage();
            rm5Var.getClass();
            h0a.f41641a.mo11433g(str2, new Object[0]);
            return new um5(zj6Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00de A[Catch: Exception -> 0x0113, LOOP:0: B:39:0x00d8->B:41:0x00de, LOOP_END, TryCatch #0 {Exception -> 0x0113, blocks: (B:14:0x0033, B:48:0x010f, B:19:0x0044, B:38:0x00c7, B:39:0x00d8, B:41:0x00de, B:42:0x00f1, B:45:0x010a, B:22:0x004b, B:28:0x0062, B:30:0x0068, B:31:0x0078, B:33:0x007e, B:34:0x0091, B:25:0x0052), top: B:52:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0109  */
    /* JADX WARN: Code duplicated, block: B:45:0x010a A[Catch: Exception -> 0x0113, TryCatch #0 {Exception -> 0x0113, blocks: (B:14:0x0033, B:48:0x010f, B:19:0x0044, B:38:0x00c7, B:39:0x00d8, B:41:0x00de, B:42:0x00f1, B:45:0x010a, B:22:0x004b, B:28:0x0062, B:30:0x0068, B:31:0x0078, B:33:0x007e, B:34:0x0091, B:25:0x0052), top: B:52:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010c, code lost:
    
        if (r12 == r1) goto L47;
     */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7169s(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$searchChats$1 chatRepositoryImpl$searchChats$1;
        List list;
        String str3;
        ArrayList arrayList;
        Iterator it;
        Object objM2861d;
        if (continuationImpl instanceof ChatRepositoryImpl$searchChats$1) {
            chatRepositoryImpl$searchChats$1 = (ChatRepositoryImpl$searchChats$1) continuationImpl;
            int i = chatRepositoryImpl$searchChats$1.f14994e;
            if ((i & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$searchChats$1.f14994e = i - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$searchChats$1 = new ChatRepositoryImpl$searchChats$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$searchChats$1 = new ChatRepositoryImpl$searchChats$1(this, continuationImpl);
        }
        Object objM25818g = chatRepositoryImpl$searchChats$1.f14992c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chatRepositoryImpl$searchChats$1.f14994e;
        C1315c c1315c = this.f16467a;
        int size = 0;
        int i3 = 1;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM25818g);
                zx0 zx0Var = this.f16470d;
                chatRepositoryImpl$searchChats$1.f14990a = str2;
                chatRepositoryImpl$searchChats$1.f14994e = 1;
                objM25818g = zx0Var.m25818g(str, "contains", str2, chatRepositoryImpl$searchChats$1);
                if (objM25818g == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                str2 = chatRepositoryImpl$searchChats$1.f14990a;
                AbstractC3193b.m15359b(objM25818g);
            } else if (i2 == 2) {
                list = chatRepositoryImpl$searchChats$1.f14991b;
                str3 = chatRepositoryImpl$searchChats$1.f14990a;
                AbstractC3193b.m15359b(objM25818g);
                List list2 = (List) objM25818g;
                arrayList = new ArrayList(v91.m23189q0(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new no8(str3, ((ChatHistoryEntity) it.next()).m7562e()));
                }
                chatRepositoryImpl$searchChats$1.f14990a = null;
                chatRepositoryImpl$searchChats$1.f14991b = list;
                chatRepositoryImpl$searchChats$1.f14994e = 3;
                objM2861d = AbstractC0758a.m2861d(new lv0(c1315c, arrayList, i3), c1315c.f17001K, chatRepositoryImpl$searchChats$1, false, true);
                if (objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM2861d = xfa.f68157a;
                }
            } else {
                if (i2 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = chatRepositoryImpl$searchChats$1.f14991b;
                AbstractC3193b.m15359b(objM25818g);
            }
            size = list.size();
            return new Integer(size);
            list = ((Results) objM25818g).f21739d;
            if (list != null) {
                List list3 = list;
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Integer(((ResultChatOld) it2.next()).m8350a()));
                }
                chatRepositoryImpl$searchChats$1.f14990a = str2;
                chatRepositoryImpl$searchChats$1.f14991b = list;
                chatRepositoryImpl$searchChats$1.f14994e = 2;
                c1315c.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM ChatHistoryEntity WHERE id IN (");
                d32.m10005B(arrayList2.size(), sb);
                sb.append(")");
                String string = sb.toString();
                objM25818g = AbstractC0758a.m2861d(new C3485q5(string, arrayList2, c1315c, 4), c1315c.f17001K, chatRepositoryImpl$searchChats$1, true, false);
                if (objM25818g != coroutineSingletons) {
                    str3 = str2;
                    List list4 = (List) objM25818g;
                    arrayList = new ArrayList(v91.m23189q0(list4, 10));
                    it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new no8(str3, ((ChatHistoryEntity) it.next()).m7562e()));
                    }
                    chatRepositoryImpl$searchChats$1.f14990a = null;
                    chatRepositoryImpl$searchChats$1.f14991b = list;
                    chatRepositoryImpl$searchChats$1.f14994e = 3;
                    objM2861d = AbstractC0758a.m2861d(new lv0(c1315c, arrayList, i3), c1315c.f17001K, chatRepositoryImpl$searchChats$1, false, true);
                    if (objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM2861d = xfa.f68157a;
                    }
                }
                return coroutineSingletons;
            }
        } catch (Exception unused) {
        }
        return new Integer(size);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Object m7170t(String str, ArrayList arrayList, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$seedLynxMemoryFromOnboarding$1 chatRepositoryImpl$seedLynxMemoryFromOnboarding$1;
        if (continuationImpl instanceof ChatRepositoryImpl$seedLynxMemoryFromOnboarding$1) {
            chatRepositoryImpl$seedLynxMemoryFromOnboarding$1 = (ChatRepositoryImpl$seedLynxMemoryFromOnboarding$1) continuationImpl;
            int i = chatRepositoryImpl$seedLynxMemoryFromOnboarding$1.f14997c;
            if ((i & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$seedLynxMemoryFromOnboarding$1.f14997c = i - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$seedLynxMemoryFromOnboarding$1 = new ChatRepositoryImpl$seedLynxMemoryFromOnboarding$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$seedLynxMemoryFromOnboarding$1 = new ChatRepositoryImpl$seedLynxMemoryFromOnboarding$1(this, continuationImpl);
        }
        Object obj = chatRepositoryImpl$seedLynxMemoryFromOnboarding$1.f14995a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chatRepositoryImpl$seedLynxMemoryFromOnboarding$1.f14997c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                zx0 zx0Var = this.f16470d;
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ww6 ww6Var = (ww6) it.next();
                    arrayList2.add(new RequestOnboardingSurveyItem(ww6Var.m24182a(), ww6Var.m24183b()));
                }
                RequestSeedOnboarding requestSeedOnboarding = new RequestSeedOnboarding(arrayList2);
                chatRepositoryImpl$seedLynxMemoryFromOnboarding$1.f14997c = 1;
                if (zx0Var.m25830s(str, requestSeedOnboarding, chatRepositoryImpl$seedLynxMemoryFromOnboarding$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return new xm5(xfa.f68157a);
        } catch (Exception e) {
            rm5 rm5Var = sm5.Companion;
            String str2 = "ChatRepository: seedLynxMemoryFromOnboarding failed - " + e.getMessage();
            rm5Var.getClass();
            h0a.f41641a.mo11433g(str2, new Object[0]);
            return new um5(zj6.f71653a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m7171u(String str, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$setLynxDataImprovementOptIn$1 chatRepositoryImpl$setLynxDataImprovementOptIn$1;
        if (continuationImpl instanceof ChatRepositoryImpl$setLynxDataImprovementOptIn$1) {
            chatRepositoryImpl$setLynxDataImprovementOptIn$1 = (ChatRepositoryImpl$setLynxDataImprovementOptIn$1) continuationImpl;
            int i = chatRepositoryImpl$setLynxDataImprovementOptIn$1.f15000c;
            if ((i & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$setLynxDataImprovementOptIn$1.f15000c = i - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$setLynxDataImprovementOptIn$1 = new ChatRepositoryImpl$setLynxDataImprovementOptIn$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$setLynxDataImprovementOptIn$1 = new ChatRepositoryImpl$setLynxDataImprovementOptIn$1(this, continuationImpl);
        }
        Object objM25834w = chatRepositoryImpl$setLynxDataImprovementOptIn$1.f14998a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chatRepositoryImpl$setLynxDataImprovementOptIn$1.f15000c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM25834w);
                zx0 zx0Var = this.f16470d;
                RequestChatDataUsage requestChatDataUsage = new RequestChatDataUsage(z);
                chatRepositoryImpl$setLynxDataImprovementOptIn$1.f15000c = 1;
                objM25834w = zx0Var.m25834w(str, requestChatDataUsage, chatRepositoryImpl$setLynxDataImprovementOptIn$1);
                if (objM25834w == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM25834w);
            }
            return new xm5(Boolean.valueOf(((ResultChatDataUsage) objM25834w).m8337a()));
        } catch (Exception e) {
            rm5 rm5Var = sm5.Companion;
            String str2 = "ChatRepository: setLynxDataImprovementOptIn failed - " + e.getMessage();
            rm5Var.getClass();
            h0a.f41641a.mo11433g(str2, new Object[0]);
            return new um5(zj6.f71653a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public final Object m7172v(String str, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$setLynxMemoryEnabled$1 chatRepositoryImpl$setLynxMemoryEnabled$1;
        if (continuationImpl instanceof ChatRepositoryImpl$setLynxMemoryEnabled$1) {
            chatRepositoryImpl$setLynxMemoryEnabled$1 = (ChatRepositoryImpl$setLynxMemoryEnabled$1) continuationImpl;
            int i = chatRepositoryImpl$setLynxMemoryEnabled$1.f15003c;
            if ((i & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$setLynxMemoryEnabled$1.f15003c = i - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$setLynxMemoryEnabled$1 = new ChatRepositoryImpl$setLynxMemoryEnabled$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$setLynxMemoryEnabled$1 = new ChatRepositoryImpl$setLynxMemoryEnabled$1(this, continuationImpl);
        }
        Object objM25816e = chatRepositoryImpl$setLynxMemoryEnabled$1.f15001a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chatRepositoryImpl$setLynxMemoryEnabled$1.f15003c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM25816e);
                zx0 zx0Var = this.f16470d;
                RequestChatMemory requestChatMemory = new RequestChatMemory(z);
                chatRepositoryImpl$setLynxMemoryEnabled$1.f15003c = 1;
                objM25816e = zx0Var.m25816e(str, requestChatMemory, chatRepositoryImpl$setLynxMemoryEnabled$1);
                if (objM25816e == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM25816e);
            }
            return new xm5(Boolean.valueOf(((ResultChatMemory) objM25816e).m8344a()));
        } catch (Exception e) {
            rm5 rm5Var = sm5.Companion;
            String str2 = "ChatRepository: setLynxMemoryEnabled failed - " + e.getMessage();
            rm5Var.getClass();
            h0a.f41641a.mo11433g(str2, new Object[0]);
            return new um5(zj6.f71653a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (r1.m7157g(r10, r11, r6) == r0) goto L32;
     */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7173w(String str, String str2, RequestChatNew requestChatNew, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$startNewChat$1 chatRepositoryImpl$startNewChat$1;
        int iM8343a;
        C1289e c1289e;
        String str3;
        String str4;
        if (continuationImpl instanceof ChatRepositoryImpl$startNewChat$1) {
            chatRepositoryImpl$startNewChat$1 = (ChatRepositoryImpl$startNewChat$1) continuationImpl;
            int i = chatRepositoryImpl$startNewChat$1.f15010g;
            if ((i & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$startNewChat$1.f15010g = i - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$startNewChat$1 = new ChatRepositoryImpl$startNewChat$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$startNewChat$1 = new ChatRepositoryImpl$startNewChat$1(this, continuationImpl);
        }
        ChatRepositoryImpl$startNewChat$1 chatRepositoryImpl$startNewChat$2 = chatRepositoryImpl$startNewChat$1;
        Object objM25826o = chatRepositoryImpl$startNewChat$2.f15008e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chatRepositoryImpl$startNewChat$2.f15010g;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM25826o);
                chatRepositoryImpl$startNewChat$2.f15004a = str;
                chatRepositoryImpl$startNewChat$2.f15005b = str2;
                chatRepositoryImpl$startNewChat$2.f15006c = requestChatNew;
                chatRepositoryImpl$startNewChat$2.f15010g = 1;
                c1289e = this;
                if (c1289e.m7174x(-1, str, str2, EmptyList.f47638a, chatRepositoryImpl$startNewChat$2) != coroutineSingletons) {
                    str3 = str;
                    str4 = str2;
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                requestChatNew = chatRepositoryImpl$startNewChat$2.f15006c;
                str4 = chatRepositoryImpl$startNewChat$2.f15005b;
                str3 = chatRepositoryImpl$startNewChat$2.f15004a;
                AbstractC3193b.m15359b(objM25826o);
                c1289e = this;
            } else if (i2 == 2) {
                str3 = chatRepositoryImpl$startNewChat$2.f15004a;
                AbstractC3193b.m15359b(objM25826o);
                c1289e = this;
                iM8343a = ((ResultChatHistorySimple) objM25826o).m8343a();
                chatRepositoryImpl$startNewChat$2.f15004a = null;
                chatRepositoryImpl$startNewChat$2.f15005b = null;
                chatRepositoryImpl$startNewChat$2.f15006c = null;
                chatRepositoryImpl$startNewChat$2.f15007d = iM8343a;
                chatRepositoryImpl$startNewChat$2.f15010g = 3;
            } else {
                if (i2 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iM8343a = chatRepositoryImpl$startNewChat$2.f15007d;
                AbstractC3193b.m15359b(objM25826o);
            }
            return new Integer(iM8343a);
            zx0 zx0Var = c1289e.f16470d;
            chatRepositoryImpl$startNewChat$2.f15004a = str3;
            chatRepositoryImpl$startNewChat$2.f15005b = str4;
            chatRepositoryImpl$startNewChat$2.f15006c = null;
            chatRepositoryImpl$startNewChat$2.f15010g = 2;
            objM25826o = zx0Var.m25826o(str3, requestChatNew, chatRepositoryImpl$startNewChat$2);
            if (objM25826o != coroutineSingletons) {
                iM8343a = ((ResultChatHistorySimple) objM25826o).m8343a();
                chatRepositoryImpl$startNewChat$2.f15004a = null;
                chatRepositoryImpl$startNewChat$2.f15005b = null;
                chatRepositoryImpl$startNewChat$2.f15006c = null;
                chatRepositoryImpl$startNewChat$2.f15007d = iM8343a;
                chatRepositoryImpl$startNewChat$2.f15010g = 3;
            }
            return coroutineSingletons;
        } catch (Exception unused) {
            iM8343a = -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:67:0x0204  */
    /* JADX WARN: Code duplicated, block: B:69:0x020c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0222  */
    /* JADX WARN: Code duplicated, block: B:72:0x0225  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0269  */
    /* JADX WARN: Code duplicated, block: B:81:0x026a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r15v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.String, java.util.List] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: x */
    public final java.lang.Object m7174x(int r28, java.lang.String r29, java.lang.String r30, java.util.List r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.C1289e.m7174x(int, java.lang.String, java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: y */
    public final eu0 m7175y(int i, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return m7167q(this.f16470d.m25825n(str, i, new RequestChatReply(str3, str4)), str, str2, Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: z */
    public final Object m7176z(int i, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        ChatRepositoryImpl$updateChatConfig$1 chatRepositoryImpl$updateChatConfig$1;
        if (continuationImpl instanceof ChatRepositoryImpl$updateChatConfig$1) {
            chatRepositoryImpl$updateChatConfig$1 = (ChatRepositoryImpl$updateChatConfig$1) continuationImpl;
            int i2 = chatRepositoryImpl$updateChatConfig$1.f15022c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatRepositoryImpl$updateChatConfig$1.f15022c = i2 - Integer.MIN_VALUE;
            } else {
                chatRepositoryImpl$updateChatConfig$1 = new ChatRepositoryImpl$updateChatConfig$1(this, continuationImpl);
            }
        } else {
            chatRepositoryImpl$updateChatConfig$1 = new ChatRepositoryImpl$updateChatConfig$1(this, continuationImpl);
        }
        Object obj = chatRepositoryImpl$updateChatConfig$1.f15020a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = chatRepositoryImpl$updateChatConfig$1.f15022c;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(obj);
                zx0 zx0Var = this.f16470d;
                RequestChatConfig requestChatConfig = new RequestChatConfig(str2);
                chatRepositoryImpl$updateChatConfig$1.f15022c = 1;
                if (zx0Var.m25815d(str, i, requestChatConfig, chatRepositoryImpl$updateChatConfig$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xfa.f68157a;
    }
}

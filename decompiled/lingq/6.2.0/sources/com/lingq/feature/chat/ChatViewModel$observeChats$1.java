package com.lingq.feature.chat;

import com.lingq.core.domain.model.chat.ChatHistoryOld;
import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import kotlin.time.Instant;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.datetime.DateTimeArithmeticException;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDateTime;
import p000.C3013ft;
import p000.a7d;
import p000.c12;
import p000.c32;
import p000.cl9;
import p000.dq7;
import p000.ez0;
import p000.fa4;
import p000.fz0;
import p000.g63;
import p000.g74;
import p000.gw0;
import p000.gz0;
import p000.h0a;
import p000.hw0;
import p000.kuc;
import p000.ma3;
import p000.o7d;
import p000.rm5;
import p000.sm5;
import p000.u91;
import p000.v0a;
import p000.v94;
import p000.xfa;
import p000.zh5;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$observeChats$1", m4291f = "ChatViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$observeChats$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24964a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f24965b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2009m f24966c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$observeChats$1(C2009m c2009m, String str, Continuation continuation) {
        super(2, continuation);
        this.f24965b = str;
        this.f24966c = c2009m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatViewModel$observeChats$1 chatViewModel$observeChats$1 = new ChatViewModel$observeChats$1(this.f24966c, this.f24965b, continuation);
        chatViewModel$observeChats$1.f24964a = obj;
        return chatViewModel$observeChats$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Exception {
        ChatViewModel$observeChats$1 chatViewModel$observeChats$1 = (ChatViewModel$observeChats$1) create((Pair) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        chatViewModel$observeChats$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        ChatByTime chatByTime;
        Object value;
        Pair pair = (Pair) this.f24964a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List<ChatHistoryOld> list = (List) pair.f47623a;
        int iIntValue = ((Number) pair.f47624b).intValue();
        C3244l c3244l = this.f24966c.f25281U;
        if (fa4.m11650l(this.f24965b, ((v94) c3244l.getValue()).f65076x)) {
            a7d gz0Var = fz0.f39944a;
            if ((iIntValue != -1 || !list.isEmpty()) && (iIntValue != 0 || !list.isEmpty())) {
                if (list.isEmpty()) {
                    gz0Var = ez0.f38099a;
                } else {
                    g63 g63Var = v0a.f64669b;
                    v0a v0aVarM17836a = o7d.m17836a();
                    Instant instantMo3285e = g74.f40314a.mo3285e();
                    instantMo3285e.getClass();
                    try {
                        java.time.Instant instantOfEpochSecond = java.time.Instant.ofEpochSecond(instantMo3285e.f47733a, instantMo3285e.f47734b);
                        instantOfEpochSecond.getClass();
                        LocalDate localDateM15603a = new LocalDateTime(java.time.LocalDateTime.ofInstant(instantOfEpochSecond, v0aVarM17836a.f64670a)).m15603a();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        LocalDate localDateM10587d = dq7.m10587d(localDateM15603a, new c12(0, 0, 7));
                        LocalDate localDateM10587d2 = dq7.m10587d(localDateM15603a, new c12(0, 0, 30));
                        for (ChatHistoryOld chatHistoryOld : list) {
                            try {
                                LocalDate localDateM15603a2 = zh5.m25656a(LocalDateTime.Companion, chatHistoryOld.f18918d).m15603a();
                                if (localDateM15603a2.equals(localDateM15603a)) {
                                    chatByTime = ChatByTime.Today;
                                } else if (localDateM15603a2.f48188a.compareTo((ChronoLocalDate) localDateM10587d.f48188a) > 0) {
                                    chatByTime = ChatByTime.Previous7Days;
                                } else {
                                    chatByTime = localDateM15603a2.f48188a.compareTo((ChronoLocalDate) localDateM10587d2.f48188a) > 0 ? ChatByTime.Previous30Days : ChatByTime.Older;
                                }
                                final C3013ft c3013ft = new C3013ft(10);
                                ((List) linkedHashMap.computeIfAbsent(chatByTime, new Function() { // from class: uz0
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return (List) c3013ft.invoke(obj2);
                                    }
                                })).add(chatHistoryOld);
                            } catch (IllegalArgumentException e) {
                                rm5 rm5Var = sm5.Companion;
                                String str = "ChatVM: Error parsing date for chat history item: " + chatHistoryOld.f18918d + " - " + e.getMessage();
                                rm5Var.getClass();
                                h0a.f41641a.mo11433g(str, new Object[0]);
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        for (ChatByTime chatByTime2 : ChatByTime.getEntries()) {
                            List list2 = (List) linkedHashMap.get(chatByTime2);
                            if (list2 != null) {
                                List<ChatHistoryOld> listM22614f1 = u91.m22614f1(list2, new ma3(7));
                                if (!listM22614f1.isEmpty()) {
                                    arrayList.add(new gw0(chatByTime2.getTitle()));
                                    for (ChatHistoryOld chatHistoryOld2 : listM22614f1) {
                                        int i = chatHistoryOld2.f18915a;
                                        String str2 = chatHistoryOld2.f18916b;
                                        if (str2.length() == 0) {
                                            String strConcat = chatHistoryOld2.f18918d;
                                            Locale locale = Locale.getDefault();
                                            locale.getClass();
                                            strConcat.getClass();
                                            if (!cl9.m4833P(strConcat, "Z", true) && !new Regex(".*[+-]\\d{2}(:?\\d{2})?$").m15427f(strConcat)) {
                                                strConcat = strConcat.concat("Z");
                                            }
                                            Instant instant = Instant.f47731c;
                                            Instant instant2 = kuc.m15696b(strConcat).toInstant();
                                            g63 g63Var2 = v0a.f64669b;
                                            v0a v0aVarM17836a2 = o7d.m17836a();
                                            java.time.Instant instantOfEpochSecond2 = java.time.Instant.ofEpochSecond(instant2.f47733a, instant2.f47734b);
                                            String id = v0aVarM17836a2.f64670a.getId();
                                            id.getClass();
                                            str2 = instantOfEpochSecond2.atZone(ZoneId.of(id)).format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT).withLocale(locale));
                                            str2.getClass();
                                        }
                                        arrayList.add(new hw0(i, str2));
                                    }
                                }
                            }
                        }
                        gz0Var = new gz0(arrayList);
                    } catch (DateTimeException e2) {
                        throw new DateTimeArithmeticException(e2);
                    }
                }
            }
            a7d a7dVar = gz0Var;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, a7dVar, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -4194305, 1023)));
        }
        return xfa.f68157a;
    }
}

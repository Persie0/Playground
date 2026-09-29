package p000;

import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.feature.chat.C2009m;
import com.lingq.feature.chat.ChatViewModel$special$$inlined$filter$2$2$1;
import com.lingq.feature.chat.ChatViewModel$special$$inlined$filterNot$5$2$1;
import com.lingq.feature.chat.ChatViewModel$special$$inlined$mapNotNull$1$2$1;
import java.util.List;
import java.util.ListIterator;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class xz0 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68979a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f68980b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2009m f68981c;

    public /* synthetic */ xz0(e83 e83Var, C2009m c2009m, int i) {
        this.f68979a = i;
        this.f68980b = e83Var;
        this.f68981c = c2009m;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        ChatViewModel$special$$inlined$filter$2$2$1 chatViewModel$special$$inlined$filter$2$2$1;
        ChatViewModel$special$$inlined$filterNot$5$2$1 chatViewModel$special$$inlined$filterNot$5$2$1;
        ChatViewModel$special$$inlined$mapNotNull$1$2$1 chatViewModel$special$$inlined$mapNotNull$1$2$1;
        int i = this.f68979a;
        xfa xfaVar = xfa.f68157a;
        C2009m c2009m = this.f68981c;
        e83 e83Var = this.f68980b;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (continuation instanceof ChatViewModel$special$$inlined$filter$2$2$1) {
                    chatViewModel$special$$inlined$filter$2$2$1 = (ChatViewModel$special$$inlined$filter$2$2$1) continuation;
                    int i2 = chatViewModel$special$$inlined$filter$2$2$1.f25027b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        chatViewModel$special$$inlined$filter$2$2$1.f25027b = i2 - Integer.MIN_VALUE;
                    } else {
                        chatViewModel$special$$inlined$filter$2$2$1 = new ChatViewModel$special$$inlined$filter$2$2$1(this, continuation);
                    }
                } else {
                    chatViewModel$special$$inlined$filter$2$2$1 = new ChatViewModel$special$$inlined$filter$2$2$1(this, continuation);
                }
                Object obj3 = chatViewModel$special$$inlined$filter$2$2$1.f25026a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = chatViewModel$special$$inlined$filter$2$2$1.f25027b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC3193b.m15359b(obj3);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj3);
                ((Boolean) obj).getClass();
                if (!((v94) c2009m.f25281U.getValue()).f65052P.f65660a) {
                    return xfaVar;
                }
                chatViewModel$special$$inlined$filter$2$2$1.f25027b = 1;
                return e83Var.emit(obj, chatViewModel$special$$inlined$filter$2$2$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
            case 1:
                if (continuation instanceof ChatViewModel$special$$inlined$filterNot$5$2$1) {
                    chatViewModel$special$$inlined$filterNot$5$2$1 = (ChatViewModel$special$$inlined$filterNot$5$2$1) continuation;
                    int i4 = chatViewModel$special$$inlined$filterNot$5$2$1.f25042b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        chatViewModel$special$$inlined$filterNot$5$2$1.f25042b = i4 - Integer.MIN_VALUE;
                    } else {
                        chatViewModel$special$$inlined$filterNot$5$2$1 = new ChatViewModel$special$$inlined$filterNot$5$2$1(this, continuation);
                    }
                } else {
                    chatViewModel$special$$inlined$filterNot$5$2$1 = new ChatViewModel$special$$inlined$filterNot$5$2$1(this, continuation);
                }
                Object obj4 = chatViewModel$special$$inlined$filterNot$5$2$1.f25041a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = chatViewModel$special$$inlined$filterNot$5$2$1.f25042b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC3193b.m15359b(obj4);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj4);
                Object obj5 = ((Triple) obj).f47633a;
                if (((Number) obj5).intValue() == -1) {
                    return xfaVar;
                }
                Number number = (Number) obj5;
                if (number.intValue() == -2) {
                    return xfaVar;
                }
                int iIntValue = number.intValue();
                Integer num = c2009m.f25289b0;
                if (num != null && iIntValue == num.intValue()) {
                    return xfaVar;
                }
                chatViewModel$special$$inlined$filterNot$5$2$1.f25042b = 1;
                return e83Var.emit(obj, chatViewModel$special$$inlined$filterNot$5$2$1) == coroutineSingletons2 ? coroutineSingletons2 : xfaVar;
            default:
                if (continuation instanceof ChatViewModel$special$$inlined$mapNotNull$1$2$1) {
                    chatViewModel$special$$inlined$mapNotNull$1$2$1 = (ChatViewModel$special$$inlined$mapNotNull$1$2$1) continuation;
                    int i6 = chatViewModel$special$$inlined$mapNotNull$1$2$1.f25049b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        chatViewModel$special$$inlined$mapNotNull$1$2$1.f25049b = i6 - Integer.MIN_VALUE;
                    } else {
                        chatViewModel$special$$inlined$mapNotNull$1$2$1 = new ChatViewModel$special$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                } else {
                    chatViewModel$special$$inlined$mapNotNull$1$2$1 = new ChatViewModel$special$$inlined$mapNotNull$1$2$1(this, continuation);
                }
                Object obj6 = chatViewModel$special$$inlined$mapNotNull$1$2$1.f25048a;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = chatViewModel$special$$inlined$mapNotNull$1$2$1.f25049b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC3193b.m15359b(obj6);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj6);
                ((Boolean) obj).getClass();
                List list = ((v94) c2009m.f25281U.getValue()).f65057e.f44629a;
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    if (((ChatMessage) objPrevious).m8014b()) {
                        obj2 = objPrevious;
                        if (obj2 != null) {
                            return xfaVar;
                        }
                        chatViewModel$special$$inlined$mapNotNull$1$2$1.f25049b = 1;
                        if (e83Var.emit(obj2, chatViewModel$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        return xfaVar;
                    }
                }
                if (obj2 != null) {
                    return xfaVar;
                }
                chatViewModel$special$$inlined$mapNotNull$1$2$1.f25049b = 1;
                if (e83Var.emit(obj2, chatViewModel$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                return xfaVar;
        }
    }
}

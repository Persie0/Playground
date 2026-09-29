package p000;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.feature.reader.old.C2412n;
import com.lingq.feature.reader.old.ReaderViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1;
import com.lingq.feature.reader.old.ReaderViewModel$special$$inlined$map$2$2$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class u08 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63216a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f63217b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2412n f63218c;

    public /* synthetic */ u08(e83 e83Var, C2412n c2412n, int i) {
        this.f63216a = i;
        this.f63217b = e83Var;
        this.f63218c = c2412n;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        ReaderViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1 readerViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1;
        ReaderViewModel$special$$inlined$map$2$2$1 readerViewModel$special$$inlined$map$2$2$1;
        int i = this.f63216a;
        xfa xfaVar = xfa.f68157a;
        C2412n c2412n = this.f63218c;
        e83 e83Var = this.f63217b;
        switch (i) {
            case 0:
                if (continuation instanceof ReaderViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1) {
                    readerViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1 = (ReaderViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i2 = readerViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1.f29013b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        readerViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1.f29013b = i2 - Integer.MIN_VALUE;
                    } else {
                        readerViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1 = new ReaderViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    readerViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1 = new ReaderViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                }
                Object obj2 = readerViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1.f29012a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = readerViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1.f29013b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC3193b.m15359b(obj2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj2);
                List list = (List) obj;
                int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(list, 10));
                if (iM15363P < 16) {
                    iM15363P = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
                for (Object obj3 : list) {
                    String str = ((LessonCard) obj3).f19178a;
                    Locale locale = c2412n.f29334Z;
                    locale.getClass();
                    linkedHashMap.put(vz1.m23610P(str, locale), obj3);
                }
                readerViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1.f29013b = 1;
                return e83Var.emit(linkedHashMap, readerViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
            default:
                if (continuation instanceof ReaderViewModel$special$$inlined$map$2$2$1) {
                    readerViewModel$special$$inlined$map$2$2$1 = (ReaderViewModel$special$$inlined$map$2$2$1) continuation;
                    int i4 = readerViewModel$special$$inlined$map$2$2$1.f29137b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        readerViewModel$special$$inlined$map$2$2$1.f29137b = i4 - Integer.MIN_VALUE;
                    } else {
                        readerViewModel$special$$inlined$map$2$2$1 = new ReaderViewModel$special$$inlined$map$2$2$1(this, continuation);
                    }
                } else {
                    readerViewModel$special$$inlined$map$2$2$1 = new ReaderViewModel$special$$inlined$map$2$2$1(this, continuation);
                }
                Object obj4 = readerViewModel$special$$inlined$map$2$2$1.f29136a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = readerViewModel$special$$inlined$map$2$2$1.f29137b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC3193b.m15359b(obj4);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj4);
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.size());
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((LessonCard) ((Map.Entry) it.next()).getValue());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : arrayList) {
                    LessonCard lessonCard = (LessonCard) obj5;
                    String str2 = lessonCard.f19191n;
                    if (str2 != null && str2.compareTo(c2412n.f29337a0) < 0 && lessonCard.f19188k < CardStatus.Known.getValue()) {
                        arrayList2.add(obj5);
                    }
                }
                Integer num = new Integer(arrayList2.size());
                readerViewModel$special$$inlined$map$2$2$1.f29137b = 1;
                return e83Var.emit(num, readerViewModel$special$$inlined$map$2$2$1) == coroutineSingletons2 ? coroutineSingletons2 : xfaVar;
        }
    }
}

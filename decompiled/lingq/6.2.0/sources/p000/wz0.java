package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.settings.C1859b;
import com.lingq.core.settings.review.C1880a;
import com.lingq.core.token.C1909e;
import com.lingq.feature.chat.C2009m;
import com.lingq.feature.chat.ChatViewModel$special$$inlined$combine$1$3;
import com.lingq.feature.lessoninfo.C2132c;
import com.lingq.feature.lessoninfo.LessonInfoViewModel$special$$inlined$combine$1$3;
import com.lingq.feature.playlist.C2251a;
import com.lingq.feature.playlist.C2255e;
import com.lingq.feature.playlist.CollectionPlaylistViewModel$special$$inlined$combine$1$3;
import com.lingq.feature.playlist.PlaylistViewModel$special$$inlined$combine$1$3;
import com.lingq.feature.reader.content.domain.C2262a;
import com.lingq.feature.reader.content.state.C2264a;
import com.lingq.feature.reader.old.C2411m;
import com.lingq.feature.reader.old.C2412n;
import com.lingq.feature.reader.video.C2583a;
import com.lingq.feature.search.fastsearch.C2768b;
import com.lingq.feature.search.search.C2778d;
import com.lingq.feature.search.search.C2779e;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.coroutines.flow.internal.AbstractC3238h;

/* JADX INFO: loaded from: classes2.dex */
public final class wz0 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67538a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f67539b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f67540c;

    public /* synthetic */ wz0(int i, Object obj, Object obj2) {
        this.f67538a = i;
        this.f67539b = obj;
        this.f67540c = obj2;
    }

    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) throws Throwable {
        int i = this.f67538a;
        int i2 = 3;
        int i3 = 8;
        int i4 = 9;
        int i5 = 4;
        int i6 = 2;
        int i7 = 0;
        int i8 = 1;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f67540c;
        Object obj2 = this.f67539b;
        switch (i) {
            case 0:
                Object objCollect = ((c83) obj2).collect(new C3602t8(i8, e83Var, (ChatMessage) obj), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                c83[] c83VarArr = (c83[]) obj2;
                Object objM15568a = AbstractC3238h.m15568a(e83Var, new o47(c83VarArr, 7), new ChatViewModel$special$$inlined$combine$1$3((C2009m) obj, null), continuation, c83VarArr);
                return objM15568a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15568a : xfaVar;
            case 2:
                Object objCollect2 = ((yz0) obj2).collect(new xz0(e83Var, (C2009m) obj, 0), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 3:
                Object objCollect3 = ((c83) obj2).collect(new xz0(e83Var, (C2009m) obj, 1), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            case 4:
                Object objCollect4 = ((wz0) obj2).collect(new xz0(e83Var, (C2009m) obj, 2), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
            case 5:
                c83[] c83VarArr2 = (c83[]) obj2;
                Object objM15568a2 = AbstractC3238h.m15568a(e83Var, new b91(c83VarArr2, 0), new CollectionPlaylistViewModel$special$$inlined$combine$1$3((C2251a) obj, null), continuation, c83VarArr2);
                return objM15568a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15568a2 : xfaVar;
            case 6:
                Object objCollect5 = ((C3244l) obj2).collect(new C3475pw(e83Var, (C2768b) obj), continuation);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : xfaVar;
            case 7:
                Object objCollect6 = ((c83) obj2).collect(new C3602t8(i6, e83Var, (tl3) obj), continuation);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : xfaVar;
            case 8:
                Object objCollect7 = ((c83) obj2).collect(new hm3(e83Var, (Locale) obj, 1), continuation);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : xfaVar;
            case 9:
                Object objCollect8 = ((c83) obj2).collect(new C3602t8(i2, e83Var, (te7) obj), continuation);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : xfaVar;
            case 10:
                Object objCollect9 = ((c83) obj2).collect(new C3602t8(i5, e83Var, (ArrayList) obj), continuation);
                return objCollect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect9 : xfaVar;
            case 11:
                Object objCollect10 = ((m83) obj2).collect(new cx0(e83Var, (String) obj, 2), continuation);
                return objCollect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect10 : xfaVar;
            case 12:
                Object objCollect11 = ((i93) obj2).collect(new C3602t8(6, e83Var, (lx4) obj), continuation);
                return objCollect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect11 : xfaVar;
            case 13:
                c83[] c83VarArr3 = (c83[]) obj2;
                Object objM15568a3 = AbstractC3238h.m15568a(e83Var, new o47(c83VarArr3, 8), new LessonInfoViewModel$special$$inlined$combine$1$3((C2132c) obj, null), continuation, c83VarArr3);
                return objM15568a3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15568a3 : xfaVar;
            case 14:
                Object objCollect12 = ((i93) obj2).collect(new cx0(e83Var, (String) obj, 3), continuation);
                return objCollect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect12 : xfaVar;
            case 15:
                Object objCollect13 = ((n83) obj2).collect(new C3602t8(i3, e83Var, (C2262a) obj), continuation);
                return objCollect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect13 : xfaVar;
            case 16:
                Object objCollect14 = ((c83) obj2).collect(new C3602t8(i4, e83Var, (ck6) obj), continuation);
                return objCollect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect14 : xfaVar;
            case 17:
                Object objCollect15 = ((wz0) obj2).collect(new bn3(e83Var, (web) obj), continuation);
                return objCollect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect15 : xfaVar;
            case 18:
                Object objCollect16 = ((i93) obj2).collect(new zd7(e83Var, (C1302r) obj, i7), continuation);
                return objCollect16 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect16 : xfaVar;
            case 19:
                c83[] c83VarArr4 = (c83[]) obj2;
                Object objM15568a4 = AbstractC3238h.m15568a(e83Var, new o47(c83VarArr4, 9), new PlaylistViewModel$special$$inlined$combine$1$3((C2255e) obj, null), continuation, c83VarArr4);
                return objM15568a4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM15568a4 : xfaVar;
            case 20:
                Object objCollect17 = ((C3513qw) obj2).collect(new C3602t8(10, e83Var, (Lesson) obj), continuation);
                return objCollect17 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect17 : xfaVar;
            case 21:
                Object objCollect18 = ((C3228h) obj2).collect(new C3602t8(11, e83Var, (C2264a) obj), continuation);
                return objCollect18 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect18 : xfaVar;
            case 22:
                Object objCollect19 = ((C3540rl) obj2).collect(new C3602t8(12, e83Var, (C2411m) obj), continuation);
                return objCollect19 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect19 : xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                Object objCollect20 = ((n83) obj2).collect(new wv7(e83Var, (C1859b) obj), continuation);
                return objCollect20 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect20 : xfaVar;
            case 24:
                Object objCollect21 = ((mv7) obj2).collect(new C3602t8(13, e83Var, (C2583a) obj), continuation);
                return objCollect21 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect21 : xfaVar;
            case 25:
                Object objCollect22 = ((c18) obj2).collect(new u08(e83Var, (C2412n) obj, 1), continuation);
                return objCollect22 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect22 : xfaVar;
            case 26:
                Object objCollect23 = ((ph4) obj2).collect(new ag8(e83Var, (C1880a) obj, i5), continuation);
                return objCollect23 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect23 : xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                Object objCollect24 = ((C3244l) obj2).collect(new C2778d(e83Var, (C2779e) obj), continuation);
                return objCollect24 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect24 : xfaVar;
            default:
                Object objCollect25 = ((C3244l) obj2).collect(new l5a(e83Var, (C1909e) obj), continuation);
                return objCollect25 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect25 : xfaVar;
        }
    }
}

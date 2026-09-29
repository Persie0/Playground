package jo;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2052l;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: jo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6530b {

    /* JADX INFO: renamed from: jo.b$a */
    public static abstract class a<N, R> implements c<N, R> {
        @Override // jo.C6530b.c
        /* JADX INFO: renamed from: b */
        public void mo13113b(N n10) {
        }
    }

    /* JADX INFO: renamed from: jo.b$b */
    public interface b<N> {
        /* JADX INFO: renamed from: c */
        Iterable<? extends N> mo13114c(N n10);
    }

    /* JADX INFO: renamed from: jo.b$c */
    public interface c<N, R> {
        /* JADX INFO: renamed from: a */
        R mo11208a();

        /* JADX INFO: renamed from: b */
        void mo13113b(N n10);

        /* JADX INFO: renamed from: c */
        boolean mo11209c(N n10);
    }

    /* JADX INFO: renamed from: jo.b$d */
    public static class d<N> {

        /* JADX INFO: renamed from: a */
        public final Set<N> f37186a = new HashSet();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13109a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 17:
            case 20:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
            default:
                objArr[0] = "nodes";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: b */
    public static Object m13110b(List list, b bVar, a aVar) {
        d dVar = new d();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m13111c(it.next(), bVar, dVar, aVar);
        }
        return aVar.mo11208a();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: c */
    public static void m13111c(Object obj, b bVar, d dVar, a aVar) {
        if (obj == null) {
            m13109a(22);
            throw null;
        }
        if (dVar.f37186a.add((N) obj) && aVar.mo11209c(obj)) {
            Iterator it = bVar.mo13114c(obj).iterator();
            while (it.hasNext()) {
                m13111c(it.next(), bVar, dVar, aVar);
            }
            aVar.mo13113b(obj);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static Boolean m13112d(List list, b bVar, InterfaceC2052l interfaceC2052l) {
        if (interfaceC2052l != null) {
            return (Boolean) m13110b(list, bVar, new C6529a(interfaceC2052l, new boolean[1]));
        }
        m13109a(9);
        throw null;
    }
}

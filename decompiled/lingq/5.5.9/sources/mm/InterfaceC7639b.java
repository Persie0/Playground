package mm;

import android.support.v4.media.session.C0166e;
import dm.C5206f;
import dm.C5207g;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: mm.b */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7639b<M extends Member> {

    /* JADX INFO: renamed from: mm.b$a */
    public static final class a {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static <M extends Member> void m15196a(InterfaceC7639b<? extends M> interfaceC7639b, Object[] objArr) {
            C5207g.m11111f(objArr, "args");
            if (C5206f.m10996Q0(interfaceC7639b) == objArr.length) {
                return;
            }
            StringBuilder sb2 = new StringBuilder("Callable expects ");
            sb2.append(C5206f.m10996Q0(interfaceC7639b));
            sb2.append(" arguments, but ");
            throw new IllegalArgumentException(C0166e.m768o(sb2, objArr.length, " were provided."));
        }
    }

    /* JADX INFO: renamed from: a */
    List<Type> mo13522a();

    /* JADX INFO: renamed from: b */
    Object mo13523b(Object[] objArr);

    /* JADX INFO: renamed from: y */
    Type mo13524y();
}

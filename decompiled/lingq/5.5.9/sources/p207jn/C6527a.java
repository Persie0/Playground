package p207jn;

import dm.C5207g;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import jm.C6525h;
import jm.C6526i;
import kn.AbstractC6731a;
import kotlin.collections.C6752c;
import tl.C9325m;

/* JADX INFO: renamed from: jn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6527a extends AbstractC6731a {

    /* JADX INFO: renamed from: f */
    public static final C6527a f37171f = new C6527a(1, 0, 7);

    /* JADX INFO: renamed from: jn.a$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C6527a m13107a(InputStream inputStream) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            C6526i c6526i = new C6526i(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(C9325m.m17681z(c6526i, 10));
            C6525h it = c6526i.iterator();
            while (it.f37168c) {
                it.mo13105a();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrM13452t0 = C6752c.m13452t0(arrayList);
            return new C6527a(Arrays.copyOf(iArrM13452t0, iArrM13452t0.length));
        }
    }

    static {
        new C6527a(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6527a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        C5207g.m11111f(iArr, "numbers");
    }
}

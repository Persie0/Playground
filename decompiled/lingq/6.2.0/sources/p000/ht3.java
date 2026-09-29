package p000;

import android.text.StaticLayout;
import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.p012ui.highlightedtext.AbstractC1932c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class ht3 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jt3 f42917a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cd9 f42918b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aj3 f42919c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cd9 f42920d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ bj3 f42921e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ui3 f42922f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ t66 f42923g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ t66 f42924h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ t66 f42925i;

    public ht3(jt3 jt3Var, cd9 cd9Var, aj3 aj3Var, cd9 cd9Var2, bj3 bj3Var, ui3 ui3Var, t66 t66Var, t66 t66Var2, t66 t66Var3) {
        this.f42917a = jt3Var;
        this.f42918b = cd9Var;
        this.f42919c = aj3Var;
        this.f42920d = cd9Var2;
        this.f42921e = bj3Var;
        this.f42922f = ui3Var;
        this.f42923g = t66Var;
        this.f42924h = t66Var2;
        this.f42925i = t66Var3;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        final jt3 jt3Var = this.f42917a;
        final cd9 cd9Var = this.f42918b;
        final aj3 aj3Var = this.f42919c;
        final cd9 cd9Var2 = this.f42920d;
        final bj3 bj3Var = this.f42921e;
        final ui3 ui3Var = this.f42922f;
        final t66 t66Var = this.f42923g;
        final t66 t66Var2 = this.f42924h;
        final t66 t66Var3 = this.f42925i;
        Object objM942e = AbstractC0117w.m942e(og7Var, null, new vi3() { // from class: gt3
            /* JADX WARN: Code duplicated, block: B:100:0x01c1  */
            /* JADX WARN: Code duplicated, block: B:94:0x019e A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:95:0x01a0  */
            /* JADX WARN: Code duplicated, block: B:97:0x01b2  */
            /* JADX WARN: Code duplicated, block: B:98:0x01b5  */
            @Override // p000.vi3
            public final Object invoke(Object obj) {
                aq4 aq4Var;
                Object next;
                Object next2;
                TokenType tokenType;
                List list;
                Object next3;
                List list2;
                gq6 gq6Var = (gq6) obj;
                Regex regex = AbstractC1932c.f24144a;
                Object obj2 = null;
                t66Var.setValue(null);
                StaticLayout staticLayout = (StaticLayout) t66Var2.getValue();
                if (staticLayout != null && (aq4Var = (aq4) t66Var3.getValue()) != null) {
                    long j = gq6Var.f41189a;
                    int iM4630e = cfd.m4630e(staticLayout, j);
                    jt3 jt3Var2 = jt3Var;
                    List list3 = jt3Var2.f46105c;
                    Integer num = jt3Var2.f46112j;
                    List list4 = jt3Var2.f46106d;
                    Iterator it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        xz7 xz7Var = ((q7b) next).f57357a;
                        if (iM4630e >= xz7Var.f69004a && iM4630e < xz7Var.f69005b) {
                            break;
                        }
                    }
                    q7b q7bVar = (q7b) next;
                    cd9 cd9Var3 = cd9Var2;
                    if (q7bVar == null) {
                        Iterator it2 = jt3Var2.f46105c.iterator();
                        loop1: while (true) {
                            if (!it2.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it2.next();
                            xz7 xz7Var2 = ((q7b) next3).f57357a;
                            if (iM4630e == xz7Var2.f69005b && (list2 = (List) cd9Var3.get(Integer.valueOf(xz7Var2.f69009f))) != null) {
                                List list5 = list2;
                                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                    Iterator it3 = list5.iterator();
                                    while (it3.hasNext()) {
                                        if (((e28) it3.next()).m10800a(j)) {
                                            break loop1;
                                        }
                                    }
                                }
                            }
                        }
                        q7bVar = (q7b) next3;
                    }
                    List list6 = list4;
                    Iterator it4 = list6.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it4.next();
                        d87 d87Var = (d87) next2;
                        if (iM4630e >= d87Var.f35173b && iM4630e < d87Var.f35174c) {
                            break;
                        }
                    }
                    d87 d87Var2 = (d87) next2;
                    cd9 cd9Var4 = cd9Var;
                    if (d87Var2 == null) {
                        loop4: for (Object obj3 : list6) {
                            d87 d87Var3 = (d87) obj3;
                            if (iM4630e == d87Var3.f35174c && (list = (List) cd9Var4.get(Integer.valueOf(d87Var3.f35172a))) != null) {
                                List list7 = list;
                                if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                                    Iterator it5 = list7.iterator();
                                    while (it5.hasNext()) {
                                        if (((e28) it5.next()).m10800a(j)) {
                                            obj2 = obj3;
                                            break loop4;
                                        }
                                    }
                                }
                            }
                        }
                        d87Var2 = (d87) obj2;
                    }
                    aj3 aj3Var2 = aj3Var;
                    if (d87Var2 == null || !(num == null || q7bVar == null)) {
                        bj3 bj3Var2 = bj3Var;
                        if (d87Var2 != null) {
                            int i = d87Var2.f35172a;
                            if (q7bVar != null) {
                                xz7 xz7Var3 = q7bVar.f57357a;
                                if (num != null && i == num.intValue()) {
                                    Integer num2 = jt3Var2.f46111i;
                                    if (num2 == null || xz7Var3.f69009f != num2.intValue()) {
                                        bj3Var2.mo825e(xz7Var3, q7bVar.f57358b ? TokenType.CardType : TokenType.WordType, Boolean.TRUE, cfd.m4632g((List) cd9Var3.get(Integer.valueOf(xz7Var3.f69009f)), aq4Var));
                                    } else {
                                        aj3Var2.invoke(d87Var2, TokenType.CardType, cfd.m4632g((List) cd9Var4.get(Integer.valueOf(i)), aq4Var));
                                    }
                                } else {
                                    aj3Var2.invoke(d87Var2, TokenType.CardType, cfd.m4632g((List) cd9Var4.get(Integer.valueOf(i)), aq4Var));
                                }
                            } else if (q7bVar != null) {
                                xz7 xz7Var4 = q7bVar.f57357a;
                                List list8 = (List) cd9Var3.get(Integer.valueOf(xz7Var4.f69009f));
                                if (q7bVar.f57358b) {
                                    tokenType = TokenType.CardType;
                                } else {
                                    tokenType = TokenType.WordType;
                                }
                                bj3Var2.mo825e(xz7Var4, tokenType, Boolean.FALSE, cfd.m4632g(list8, aq4Var));
                            } else {
                                ui3Var.mo0a();
                            }
                        } else if (q7bVar != null) {
                            xz7 xz7Var5 = q7bVar.f57357a;
                            List list9 = (List) cd9Var3.get(Integer.valueOf(xz7Var5.f69009f));
                            if (q7bVar.f57358b) {
                                tokenType = TokenType.CardType;
                            } else {
                                tokenType = TokenType.WordType;
                            }
                            bj3Var2.mo825e(xz7Var5, tokenType, Boolean.FALSE, cfd.m4632g(list9, aq4Var));
                        } else {
                            ui3Var.mo0a();
                        }
                    } else {
                        aj3Var2.invoke(d87Var2, TokenType.CardType, cfd.m4632g((List) cd9Var4.get(Integer.valueOf(d87Var2.f35172a)), aq4Var));
                    }
                }
                return xfa.f68157a;
            }
        }, continuation, 7);
        return objM942e == CoroutineSingletons.COROUTINE_SUSPENDED ? objM942e : xfa.f68157a;
    }
}

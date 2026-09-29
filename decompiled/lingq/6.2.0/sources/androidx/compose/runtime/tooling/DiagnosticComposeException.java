package androidx.compose.runtime.tooling;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import p000.AbstractC3550rv;
import p000.qe1;
import p000.re1;
import p000.u91;
import p000.u98;
import p000.vz1;

/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticComposeException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final qe1 f3804a;

    public DiagnosticComposeException(qe1 qe1Var) {
        this.f3804a = qe1Var;
        if (qe1Var.f57634b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = qe1Var.f57633a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            re1 re1Var = (re1) list.get(i);
            if (!AbstractC3550rv.m20822P(iArr, re1Var.f59153a)) {
                if (re1Var.f59153a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((re1) list.get(i3)).f59153a == 1000) {
                        break;
                    } else {
                        u91.m22609a1(arrayList);
                    }
                } else {
                    arrayList.add(re1Var);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((re1) arrayList.get(i4)).f59153a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        qe1 qe1Var = this.f3804a;
        if (!qe1Var.f57634b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        ListBuilder listBuilderM23650t = vz1.m23650t();
        List list = qe1Var.f57633a;
        list.getClass();
        u98 u98Var = new u98(list);
        int iMo3718d = u98Var.mo3718d();
        for (int i = 0; i < iMo3718d; i++) {
            ((re1) u98Var.get(i)).getClass();
        }
        ListBuilder listBuilderM23635i = vz1.m23635i(listBuilderM23650t);
        listBuilderM23635i.getClass();
        u98 u98Var2 = new u98(listBuilderM23635i);
        int iMo3718d2 = u98Var2.mo3718d();
        for (int i2 = 0; i2 < iMo3718d2; i2++) {
            String str = (String) u98Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}

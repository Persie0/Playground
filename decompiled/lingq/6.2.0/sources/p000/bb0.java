package p000;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.gestures.AbstractC0104l;
import androidx.compose.foundation.gestures.C0098f;
import androidx.compose.foundation.gestures.C0100h;
import androidx.compose.foundation.gestures.C0105m;
import androidx.compose.foundation.gestures.C0116v;
import androidx.compose.foundation.gestures.C0119y;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0358h;
import androidx.datastore.core.SimpleActor;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import coil.request.NullRequestDataException;
import com.google.android.gms.common.api.ApiException;
import com.lingq.core.database.dao.C1319g;
import com.lingq.core.domain.model.language.LanguageProgress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bb0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8261a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8262b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f8263c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f8264d;

    public /* synthetic */ bb0(ub5 ub5Var, ac5 ac5Var, vi3 vi3Var) {
        this.f8261a = 10;
        this.f8263c = ub5Var;
        this.f8264d = ac5Var;
        this.f8262b = vi3Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: d */
    private final Object m3549d(Object obj) {
        Integer numM13491d;
        Integer numM13492e;
        Integer numM13492e2;
        Integer numM13491d2;
        rw9 rw9Var;
        rw9 rw9Var2;
        sw9 sw9Var;
        sw9 sw9Var2;
        Integer numM13491d3;
        Integer numM13492e3;
        Integer numM13492e4;
        Integer numM13491d4;
        rw9 rw9Var3;
        rw9 rw9Var4;
        sw9 sw9Var3;
        sw9 sw9Var4;
        qfa qfaVar;
        KeyCommand keyCommand = (KeyCommand) this.f8262b;
        uu9 uu9Var = (uu9) this.f8263c;
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.f8264d;
        hv9 hv9Var = (hv9) obj;
        int i = tu9.f62916a[keyCommand.ordinal()];
        xfa xfaVar = xfa.f68157a;
        vv9 vv9Var = null;
        switch (i) {
            case 1:
                uu9Var.f64372b.m1104d(false);
                return xfaVar;
            case 2:
                uu9Var.f64372b.m1116q();
                return xfaVar;
            case 3:
                uu9Var.f64372b.m1105f();
                return xfaVar;
            case 4:
                hv9Var.f42999e.f9149a = null;
                if (hv9Var.f43001g.f54604b.length() > 0) {
                    if (cx9.m9921c(hv9Var.f43000f)) {
                        hv9Var.m13496i();
                        return xfaVar;
                    }
                    boolean zM13493f = hv9Var.m13493f();
                    long j = hv9Var.f43000f;
                    if (zM13493f) {
                        int iM9924f = cx9.m9924f(j);
                        hv9Var.m13504q(iM9924f, iM9924f);
                        return xfaVar;
                    }
                    int iM9923e = cx9.m9923e(j);
                    hv9Var.m13504q(iM9923e, iM9923e);
                }
                return xfaVar;
            case 5:
                hv9Var.f42999e.f9149a = null;
                if (hv9Var.f43001g.f54604b.length() > 0) {
                    if (cx9.m9921c(hv9Var.f43000f)) {
                        hv9Var.m13500m();
                        return xfaVar;
                    }
                    boolean zM13493f2 = hv9Var.m13493f();
                    long j2 = hv9Var.f43000f;
                    if (zM13493f2) {
                        int iM9923e2 = cx9.m9923e(j2);
                        hv9Var.m13504q(iM9923e2, iM9923e2);
                        return xfaVar;
                    }
                    int iM9924f2 = cx9.m9924f(j2);
                    hv9Var.m13504q(iM9924f2, iM9924f2);
                    return xfaVar;
                }
                return xfaVar;
            case 6:
                bx9 bx9Var = hv9Var.f42999e;
                bx9Var.f9149a = null;
                C3419on c3419on = hv9Var.f43001g;
                String str = c3419on.f54604b;
                String str2 = c3419on.f54604b;
                if (str.length() > 0) {
                    if (hv9Var.m13493f()) {
                        bx9Var.f9149a = null;
                        if (str2.length() > 0 && (numM13492e = hv9Var.m13492e()) != null) {
                            int iIntValue = numM13492e.intValue();
                            hv9Var.m13504q(iIntValue, iIntValue);
                            return xfaVar;
                        }
                    } else {
                        bx9Var.f9149a = null;
                        if (str2.length() > 0 && (numM13491d = hv9Var.m13491d()) != null) {
                            int iIntValue2 = numM13491d.intValue();
                            hv9Var.m13504q(iIntValue2, iIntValue2);
                            return xfaVar;
                        }
                    }
                }
                return xfaVar;
            case 7:
                bx9 bx9Var2 = hv9Var.f42999e;
                bx9Var2.f9149a = null;
                C3419on c3419on2 = hv9Var.f43001g;
                String str3 = c3419on2.f54604b;
                String str4 = c3419on2.f54604b;
                if (str3.length() > 0) {
                    if (hv9Var.m13493f()) {
                        bx9Var2.f9149a = null;
                        if (str4.length() > 0 && (numM13491d2 = hv9Var.m13491d()) != null) {
                            int iIntValue3 = numM13491d2.intValue();
                            hv9Var.m13504q(iIntValue3, iIntValue3);
                            return xfaVar;
                        }
                    } else {
                        bx9Var2.f9149a = null;
                        if (str4.length() > 0 && (numM13492e2 = hv9Var.m13492e()) != null) {
                            int iIntValue4 = numM13492e2.intValue();
                            hv9Var.m13504q(iIntValue4, iIntValue4);
                            return xfaVar;
                        }
                    }
                }
                return xfaVar;
            case 8:
                hv9Var.m13499l();
                return xfaVar;
            case 9:
                hv9Var.m13497j();
                return xfaVar;
            case 10:
                if (hv9Var.f43001g.f54604b.length() > 0 && (rw9Var = hv9Var.f42997c) != null) {
                    int iM13494g = hv9Var.m13494g(rw9Var, -1);
                    hv9Var.m13504q(iM13494g, iM13494g);
                    return xfaVar;
                }
                return xfaVar;
            case 11:
                if (hv9Var.f43001g.f54604b.length() > 0 && (rw9Var2 = hv9Var.f42997c) != null) {
                    int iM13494g2 = hv9Var.m13494g(rw9Var2, 1);
                    hv9Var.m13504q(iM13494g2, iM13494g2);
                    return xfaVar;
                }
                return xfaVar;
            case 12:
                if (hv9Var.f43001g.f54604b.length() > 0 && (sw9Var = hv9Var.f43003i) != null) {
                    int iM13495h = hv9Var.m13495h(sw9Var, -1);
                    hv9Var.m13504q(iM13495h, iM13495h);
                    return xfaVar;
                }
                return xfaVar;
            case 13:
                if (hv9Var.f43001g.f54604b.length() > 0 && (sw9Var2 = hv9Var.f43003i) != null) {
                    int iM13495h2 = hv9Var.m13495h(sw9Var2, 1);
                    hv9Var.m13504q(iM13495h2, iM13495h2);
                    return xfaVar;
                }
                return xfaVar;
            case 14:
                hv9Var.m13502o();
                return xfaVar;
            case 15:
                hv9Var.m13501n();
                return xfaVar;
            case 16:
                hv9Var.f42999e.f9149a = null;
                if (hv9Var.f43001g.f54604b.length() > 0) {
                    if (hv9Var.m13493f()) {
                        hv9Var.m13502o();
                        return xfaVar;
                    }
                    hv9Var.m13501n();
                    return xfaVar;
                }
                return xfaVar;
            case 17:
                hv9Var.f42999e.f9149a = null;
                if (hv9Var.f43001g.f54604b.length() > 0) {
                    if (hv9Var.m13493f()) {
                        hv9Var.m13501n();
                        return xfaVar;
                    }
                    hv9Var.m13502o();
                    return xfaVar;
                }
                return xfaVar;
            case 18:
                hv9Var.f42999e.f9149a = null;
                if (hv9Var.f43001g.f54604b.length() > 0) {
                    hv9Var.m13504q(0, 0);
                    return xfaVar;
                }
                return xfaVar;
            case 19:
                hv9Var.f42999e.f9149a = null;
                C3419on c3419on3 = hv9Var.f43001g;
                if (c3419on3.f54604b.length() > 0) {
                    int length = c3419on3.f54604b.length();
                    hv9Var.m13504q(length, length);
                    return xfaVar;
                }
                return xfaVar;
            case 20:
                List listM13488a = hv9Var.m13488a(new wx8(7));
                if (listM13488a != null) {
                    uu9Var.m22943a(listM13488a);
                    return xfaVar;
                }
                return xfaVar;
            case 21:
                List listM13488a2 = hv9Var.m13488a(new wx8(8));
                if (listM13488a2 != null) {
                    uu9Var.m22943a(listM13488a2);
                    return xfaVar;
                }
                return xfaVar;
            case 22:
                List listM13488a3 = hv9Var.m13488a(new wx8(9));
                if (listM13488a3 != null) {
                    uu9Var.m22943a(listM13488a3);
                    return xfaVar;
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                List listM13488a4 = hv9Var.m13488a(new wx8(10));
                if (listM13488a4 != null) {
                    uu9Var.m22943a(listM13488a4);
                    return xfaVar;
                }
                return xfaVar;
            case 24:
                List listM13488a5 = hv9Var.m13488a(new wx8(11));
                if (listM13488a5 != null) {
                    uu9Var.m22943a(listM13488a5);
                    return xfaVar;
                }
                return xfaVar;
            case 25:
                List listM13488a6 = hv9Var.m13488a(new wx8(12));
                if (listM13488a6 != null) {
                    uu9Var.m22943a(listM13488a6);
                    return xfaVar;
                }
                return xfaVar;
            case 26:
                if (!uu9Var.f64375e) {
                    uu9Var.m22943a(vz1.m23604J(new hb1("\n", 1)));
                    return xfaVar;
                }
                ref$BooleanRef.f47713a = uu9Var.f64371a.f70592x.f61018b.f70586r.m11889b(uu9Var.f64382l);
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                if (uu9Var.f64375e) {
                    ref$BooleanRef.f47713a = false;
                    return xfaVar;
                }
                uu9Var.m22943a(vz1.m23604J(new hb1("\t", 1)));
                return xfaVar;
            case 28:
                hv9Var.f42999e.f9149a = null;
                C3419on c3419on4 = hv9Var.f43001g;
                if (c3419on4.f54604b.length() > 0) {
                    hv9Var.m13504q(0, c3419on4.f54604b.length());
                    return xfaVar;
                }
                return xfaVar;
            case 29:
                hv9Var.m13496i();
                hv9Var.m13503p();
                return xfaVar;
            case 30:
                hv9Var.m13500m();
                hv9Var.m13503p();
                return xfaVar;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                bx9 bx9Var3 = hv9Var.f42999e;
                bx9Var3.f9149a = null;
                C3419on c3419on5 = hv9Var.f43001g;
                String str5 = c3419on5.f54604b;
                String str6 = c3419on5.f54604b;
                if (str5.length() > 0) {
                    if (hv9Var.m13493f()) {
                        bx9Var3.f9149a = null;
                        if (str6.length() > 0 && (numM13492e3 = hv9Var.m13492e()) != null) {
                            int iIntValue5 = numM13492e3.intValue();
                            hv9Var.m13504q(iIntValue5, iIntValue5);
                        }
                    } else {
                        bx9Var3.f9149a = null;
                        if (str6.length() > 0 && (numM13491d3 = hv9Var.m13491d()) != null) {
                            int iIntValue6 = numM13491d3.intValue();
                            hv9Var.m13504q(iIntValue6, iIntValue6);
                        }
                    }
                }
                hv9Var.m13503p();
                return xfaVar;
            case 32:
                bx9 bx9Var4 = hv9Var.f42999e;
                bx9Var4.f9149a = null;
                C3419on c3419on6 = hv9Var.f43001g;
                String str7 = c3419on6.f54604b;
                String str8 = c3419on6.f54604b;
                if (str7.length() > 0) {
                    if (hv9Var.m13493f()) {
                        bx9Var4.f9149a = null;
                        if (str8.length() > 0 && (numM13491d4 = hv9Var.m13491d()) != null) {
                            int iIntValue7 = numM13491d4.intValue();
                            hv9Var.m13504q(iIntValue7, iIntValue7);
                        }
                    } else {
                        bx9Var4.f9149a = null;
                        if (str8.length() > 0 && (numM13492e4 = hv9Var.m13492e()) != null) {
                            int iIntValue8 = numM13492e4.intValue();
                            hv9Var.m13504q(iIntValue8, iIntValue8);
                        }
                    }
                }
                hv9Var.m13503p();
                return xfaVar;
            case 33:
                hv9Var.m13499l();
                hv9Var.m13503p();
                return xfaVar;
            case 34:
                hv9Var.m13497j();
                hv9Var.m13503p();
                return xfaVar;
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                hv9Var.m13502o();
                hv9Var.m13503p();
                return xfaVar;
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                hv9Var.m13501n();
                hv9Var.m13503p();
                return xfaVar;
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                hv9Var.f42999e.f9149a = null;
                if (hv9Var.f43001g.f54604b.length() > 0) {
                    if (hv9Var.m13493f()) {
                        hv9Var.m13502o();
                    } else {
                        hv9Var.m13501n();
                    }
                }
                hv9Var.m13503p();
                return xfaVar;
            case 38:
                hv9Var.f42999e.f9149a = null;
                if (hv9Var.f43001g.f54604b.length() > 0) {
                    if (hv9Var.m13493f()) {
                        hv9Var.m13501n();
                    } else {
                        hv9Var.m13502o();
                    }
                }
                hv9Var.m13503p();
                return xfaVar;
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                if (hv9Var.f43001g.f54604b.length() > 0 && (rw9Var3 = hv9Var.f42997c) != null) {
                    int iM13494g3 = hv9Var.m13494g(rw9Var3, -1);
                    hv9Var.m13504q(iM13494g3, iM13494g3);
                }
                hv9Var.m13503p();
                return xfaVar;
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                if (hv9Var.f43001g.f54604b.length() > 0 && (rw9Var4 = hv9Var.f42997c) != null) {
                    int iM13494g4 = hv9Var.m13494g(rw9Var4, 1);
                    hv9Var.m13504q(iM13494g4, iM13494g4);
                }
                hv9Var.m13503p();
                return xfaVar;
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                if (hv9Var.f43001g.f54604b.length() > 0 && (sw9Var3 = hv9Var.f43003i) != null) {
                    int iM13495h3 = hv9Var.m13495h(sw9Var3, -1);
                    hv9Var.m13504q(iM13495h3, iM13495h3);
                }
                hv9Var.m13503p();
                return xfaVar;
            case 42:
                if (hv9Var.f43001g.f54604b.length() > 0 && (sw9Var4 = hv9Var.f43003i) != null) {
                    int iM13495h4 = hv9Var.m13495h(sw9Var4, 1);
                    hv9Var.m13504q(iM13495h4, iM13495h4);
                }
                hv9Var.m13503p();
                return xfaVar;
            case 43:
                hv9Var.f42999e.f9149a = null;
                if (hv9Var.f43001g.f54604b.length() > 0) {
                    hv9Var.m13504q(0, 0);
                }
                hv9Var.m13503p();
                return xfaVar;
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                hv9Var.f42999e.f9149a = null;
                C3419on c3419on7 = hv9Var.f43001g;
                if (c3419on7.f54604b.length() > 0) {
                    int length2 = c3419on7.f54604b.length();
                    hv9Var.m13504q(length2, length2);
                }
                hv9Var.m13503p();
                return xfaVar;
            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                hv9Var.f42999e.f9149a = null;
                if (hv9Var.f43001g.f54604b.length() > 0) {
                    long j3 = hv9Var.f43000f;
                    int i2 = cx9.f34693c;
                    int i3 = (int) (j3 & 4294967295L);
                    hv9Var.m13504q(i3, i3);
                    return xfaVar;
                }
                return xfaVar;
            case 46:
                rfa rfaVar = uu9Var.f64378h;
                if (rfaVar != null) {
                    rfaVar.m20647a(vv9.m23560a(hv9Var.f43002h, hv9Var.f43001g, hv9Var.f43000f, 4));
                }
                rfa rfaVar2 = uu9Var.f64378h;
                if (rfaVar2 != null) {
                    qfa qfaVar2 = rfaVar2.f59209a;
                    if (qfaVar2 != null && (qfaVar = (qfa) qfaVar2.f57705a) != null) {
                        rfaVar2.f59209a = qfaVar;
                        rfaVar2.f59211c -= ((vv9) qfaVar2.f57706b).f65990a.f54604b.length();
                        rfaVar2.f59210b = new qfa(rfaVar2.f59210b, (vv9) qfaVar2.f57706b);
                        vv9Var = (vv9) qfaVar.f57706b;
                    }
                    if (vv9Var != null) {
                        uu9Var.f64381k.invoke(vv9Var);
                        return xfaVar;
                    }
                }
                return xfaVar;
            case 47:
                rfa rfaVar3 = uu9Var.f64378h;
                if (rfaVar3 != null) {
                    qfa qfaVar3 = rfaVar3.f59210b;
                    if (qfaVar3 != null) {
                        rfaVar3.f59210b = (qfa) qfaVar3.f57705a;
                        vv9 vv9Var2 = (vv9) qfaVar3.f57706b;
                        rfaVar3.f59209a = new qfa(rfaVar3.f59209a, vv9Var2);
                        rfaVar3.f59211c = vv9Var2.f65990a.f54604b.length() + rfaVar3.f59211c;
                        vv9Var = (vv9) qfaVar3.f57706b;
                    }
                    if (vv9Var != null) {
                        uu9Var.f64381k.invoke(vv9Var);
                        return xfaVar;
                    }
                }
                return xfaVar;
            case eda.f37086g /* 48 */:
            case 49:
                return xfaVar;
            default:
                gm5.m12750e();
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        ym0 ym0Var;
        LanguageProgress languageProgress;
        C3378nn c3378nn;
        int i = this.f8261a;
        int i2 = 2;
        boolean z = false;
        int i3 = 1;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f8264d;
        Object obj3 = this.f8263c;
        Object obj4 = this.f8262b;
        switch (i) {
            case 0:
                vi3 vi3Var = (vi3) obj4;
                t66 t66Var = (t66) obj2;
                vv9 vv9Var = (vv9) obj;
                ((t66) obj3).setValue(vv9Var);
                boolean zM11650l = fa4.m11650l((String) t66Var.getValue(), vv9Var.f65990a.f54604b);
                C3419on c3419on = vv9Var.f65990a;
                t66Var.setValue(c3419on.f54604b);
                if (!zM11650l) {
                    vi3Var.invoke(c3419on.f54604b);
                }
                return xfaVar;
            case 1:
                mi8 mi8Var = (mi8) obj3;
                vi0 vi0Var = (vi0) obj2;
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                gj9 gj9Var = (gj9) ((w41) obj4).f66366b;
                gj9Var.getClass();
                float fFloatValue = Float.valueOf(gj9Var.f40881b).floatValue();
                float f = fFloatValue < 0.0f ? 0.0f : fFloatValue;
                float f2 = f / 2.0f;
                float f3 = f * 2.0f;
                float fMin = Math.min(Math.abs(mi8Var.m16846b()), Math.abs(mi8Var.m16845a()));
                float f4 = mi8Var.f51360a;
                float f5 = mi8Var.f51361b;
                boolean z2 = f3 > fMin;
                long j = mi8Var.f51364e;
                el9 el9Var = new el9(f, 0.0f, 0, 0, 30);
                if (z2) {
                    InterfaceC0310a.m1412G(interfaceC0310a, vi0Var, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(mi8Var.m16846b())) << 32) | (((long) Float.floatToRawIntBits(mi8Var.m16845a())) & 4294967295L), j, 0.0f, null, null, 240);
                } else if (Float.intBitsToFloat((int) (j >> 32)) < f2) {
                    float f6 = f4 + f;
                    float f7 = f5 + f;
                    float f8 = mi8Var.f51362c - f;
                    float f9 = mi8Var.f51363d - f;
                    C3309ls c3309lsMo603o0 = interfaceC0310a.mo603o0();
                    long jM16483A = c3309lsMo603o0.m16483A();
                    c3309lsMo603o0.m16515r().mo17016h();
                    try {
                        ((qn3) c3309lsMo603o0.f50064b).m20070k(f6, f7, f8, f9, 0);
                        InterfaceC0310a.m1412G(interfaceC0310a, vi0Var, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(mi8Var.m16846b())) << 32) | (((long) Float.floatToRawIntBits(mi8Var.m16845a())) & 4294967295L), j, 0.0f, null, null, 240);
                    } finally {
                        AbstractC3393o1.m17751z(c3309lsMo603o0, jM16483A);
                    }
                } else {
                    InterfaceC0310a.m1412G(interfaceC0310a, vi0Var, (((long) Float.floatToRawIntBits(f4 + f2)) << 32) | (((long) Float.floatToRawIntBits(f5 + f2)) & 4294967295L), (((long) Float.floatToRawIntBits(mi8Var.m16846b() - f)) << 32) | (((long) Float.floatToRawIntBits(mi8Var.m16845a() - f)) & 4294967295L), do7.m10518E(f2, j), 0.0f, el9Var, null, 208);
                }
                return xfaVar;
            case 2:
                C0098f c0098f = (C0098f) obj4;
                cd4 cd4Var = (cd4) obj3;
                ho8 ho8Var = (ho8) obj2;
                float fFloatValue2 = ((Float) obj).floatValue();
                float f10 = c0098f.f2248L ? 1.0f : -1.0f;
                C0116v c0116v = c0098f.f2247K;
                long jM933e = c0116v.m933e(c0116v.m936h(f10 * fFloatValue2));
                C0116v c0116v2 = ho8Var.f42716a;
                float fM935g = c0116v.m935g(c0116v.m933e(c0116v2.m931c(c0116v2.f2370k, jM933e, 1))) * f10;
                if (Math.abs(fM935g) < Math.abs(fFloatValue2)) {
                    cd4Var.mo4537a(rcd.m20580a("Scroll animation cancelled because scroll was not consumed (" + fM935g + " < " + fFloatValue2 + ')', null));
                }
                return xfaVar;
            case 3:
                yw4 yw4Var = (yw4) obj4;
                vv9 vv9Var2 = (vv9) obj3;
                mq6 mq6Var = (mq6) obj2;
                InterfaceC0310a interfaceC0310a2 = (InterfaceC0310a) obj;
                sw9 sw9VarM25363d = yw4Var.m25363d();
                if (sw9VarM25363d != null) {
                    ym0 ym0VarM16515r = interfaceC0310a2.mo603o0().m16515r();
                    long j2 = ((cx9) ((xc9) yw4Var.f70567A).getValue()).f34694a;
                    long j3 = ((cx9) ((xc9) yw4Var.f70568B).getValue()).f34694a;
                    rw9 rw9Var = sw9VarM25363d.f61519a;
                    w46 w46Var = rw9Var.f59976b;
                    qw9 qw9Var = rw9Var.f59975a;
                    u8a u8aVar = yw4Var.f70593y;
                    long j4 = yw4Var.f70594z;
                    if (!cx9.m9921c(j2)) {
                        u8aVar.m22555p(j4);
                        int iMo13411t = mq6Var.mo13411t(cx9.m9924f(j2));
                        int iMo13411t2 = mq6Var.mo13411t(cx9.m9923e(j2));
                        if (iMo13411t != iMo13411t2) {
                            ym0VarM16515r.mo17009a(rw9Var.m20962i(iMo13411t, iMo13411t2), u8aVar);
                        }
                    } else if (!cx9.m9921c(j3)) {
                        long jM23586c = qw9Var.f58296b.m23586c();
                        aa1 aa1Var = new aa1(jM23586c);
                        if (jM23586c == 16) {
                            aa1Var = null;
                        }
                        long j5 = aa1Var != null ? aa1Var.f414a : aa1.f403b;
                        u8aVar.m22555p(aa1.m198b(aa1.m200d(j5) * 0.2f, j5));
                        int iMo13411t3 = mq6Var.mo13411t(cx9.m9924f(j3));
                        int iMo13411t4 = mq6Var.mo13411t(cx9.m9923e(j3));
                        if (iMo13411t3 != iMo13411t4) {
                            ym0VarM16515r.mo17009a(rw9Var.m20962i(iMo13411t3, iMo13411t4), u8aVar);
                        }
                    } else if (!cx9.m9921c(vv9Var2.f65991b)) {
                        u8aVar.m22555p(j4);
                        long j6 = vv9Var2.f65991b;
                        int iMo13411t5 = mq6Var.mo13411t(cx9.m9924f(j6));
                        int iMo13411t6 = mq6Var.mo13411t(cx9.m9923e(j6));
                        if (iMo13411t5 != iMo13411t6) {
                            ym0VarM16515r.mo17009a(rw9Var.m20962i(iMo13411t5, iMo13411t6), u8aVar);
                        }
                    }
                    boolean z3 = rw9Var.m20957d() && qw9Var.f58300f != 3;
                    if (z3) {
                        long j7 = rw9Var.f59977c;
                        e28 e28VarM23907b = wfb.m23907b(0L, (((long) Float.floatToRawIntBits((int) (j7 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j7 & 4294967295L))) & 4294967295L));
                        ym0VarM16515r.mo17016h();
                        ym0.m25196q(ym0VarM16515r, e28VarM23907b);
                    }
                    he9 he9Var = qw9Var.f58296b.f66065a;
                    rt9 rt9Var = he9Var.f42276m;
                    xv9 xv9Var = he9Var.f42264a;
                    if (rt9Var == null) {
                        rt9Var = rt9.f59801b;
                    }
                    rt9 rt9Var2 = rt9Var;
                    l39 l39Var = he9Var.f42277n;
                    if (l39Var == null) {
                        l39Var = l39.f48992d;
                    }
                    l39 l39Var2 = l39Var;
                    ml2 ml2Var = he9Var.f42279p;
                    if (ml2Var == null) {
                        ml2Var = w33.f66328a;
                    }
                    ml2 ml2Var2 = ml2Var;
                    try {
                        vi0 vi0VarMo24174b = xv9Var.mo24174b();
                        wv9 wv9Var = wv9.f67395a;
                        try {
                            if (vi0VarMo24174b != null) {
                                ym0Var = ym0VarM16515r;
                                w46.m23739j(w46Var, ym0Var, vi0VarMo24174b, xv9Var != wv9Var ? xv9Var.mo24175c() : 1.0f, l39Var2, rt9Var2, ml2Var2);
                            } else {
                                ym0Var = ym0VarM16515r;
                                w46.m23738i(w46Var, ym0Var, xv9Var != wv9Var ? xv9Var.mo24173a() : aa1.f403b, l39Var2, rt9Var2, ml2Var2);
                            }
                            if (z3) {
                                ym0Var.mo17024p();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (z3) {
                                ym0VarM16515r.mo17024p();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return xfaVar;
            case 4:
                ((ConcurrentHashMap) obj4).remove((String) obj3, (pg9) obj2);
                return xfaVar;
            case 5:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj4;
                C3838zm c3838zm = (C3838zm) obj;
                float fFloatValue3 = ((Number) ((xc9) c3838zm.f71729e).getValue()).floatValue() - ref$FloatRef.f47715a;
                float fMo3997a = ((wn8) obj3).mo3997a(fFloatValue3);
                ref$FloatRef.f47715a = ((Number) ((xc9) c3838zm.f71729e).getValue()).floatValue();
                ((Ref$FloatRef) obj2).f47715a = ((Number) c3838zm.m25699b()).floatValue();
                if (Math.abs(fFloatValue3 - fMo3997a) > 0.5f) {
                    c3838zm.m25698a();
                }
                return xfaVar;
            case 6:
                String str = (String) obj3;
                List list = (List) obj2;
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0((String) obj4);
                try {
                    ik8VarMo2873e0.mo2874C(1, str);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ik8VarMo2873e0.mo2878j(i2, ((Number) it.next()).intValue());
                        i2++;
                    }
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        arrayList.add(Integer.valueOf((int) ik8VarMo2873e0.getLong(0)));
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 7:
                al2 al2Var = (al2) obj4;
                Orientation orientation = (Orientation) obj2;
                long j8 = ((pk2) obj).f56334a;
                long jM12826g = ((C0105m) obj3).f2292i0 ? gq6.m12826g(-1.0f, j8) : gq6.m12826g(1.0f, j8);
                aj3 aj3Var = AbstractC0104l.f2286a;
                al2Var.mo538a(Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? jM12826g & 4294967295L : jM12826g >> 32)));
                return xfaVar;
            case 8:
                qe3 qe3Var = (qe3) obj4;
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = (AbstractComponentCallbacksC0635c) obj3;
                y76 y76Var = (y76) obj2;
                ub5 ub5Var = (ub5) obj;
                ArrayList arrayList2 = qe3Var.f57639g;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (fa4.m11650l(((Pair) it2.next()).f47623a, abstractComponentCallbacksC0635c.f5680V)) {
                            z = true;
                        }
                    }
                }
                if (ub5Var != null && !z) {
                    lg3 lg3VarM2112n = abstractComponentCallbacksC0635c.m2112n();
                    lg3VarM2112n.m16179b();
                    wb5 wb5Var = lg3VarM2112n.f49626e;
                    if (wb5Var.f66586d.isAtLeast(Lifecycle$State.CREATED)) {
                        wb5Var.mo21323g((tb5) qe3Var.f57641i.invoke(y76Var));
                    }
                }
                return xfaVar;
            case 9:
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                C1319g c1319g = (C1319g) obj2;
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT * FROM LanguageProgressEntity WHERE languageCode = ? AND interval = ?");
                try {
                    ik8VarMo2873e1.mo2874C(1, str2);
                    ik8VarMo2873e1.mo2874C(2, str3);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e1, "interval");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e1, "languageCode");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e1, "writtenWordsGoal");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e1, "speakingTimeGoal");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e1, "totalWordsKnown");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e1, "readWords");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e1, "totalCards");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e1, "activityIndex");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e1, "knownWordsGoal");
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e1, "listeningTimeGoal");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e1, "speakingTime");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e1, "cardsCreatedGoal");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e1, "knownWords");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e1, "intervals");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e1, "cardsCreated");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e1, "readWordsGoal");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e1, "listeningTime");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e1, "cardsLearned");
                    int iM14108v19 = AbstractC3122is.m14108v(ik8VarMo2873e1, "writtenWords");
                    int iM14108v20 = AbstractC3122is.m14108v(ik8VarMo2873e1, "cardsLearnedGoal");
                    int iM14108v21 = AbstractC3122is.m14108v(ik8VarMo2873e1, "earnedCoins");
                    int iM14108v22 = AbstractC3122is.m14108v(ik8VarMo2873e1, "earnedCoinsGoal");
                    int iM14108v23 = AbstractC3122is.m14108v(ik8VarMo2873e1, "wpm");
                    int iM14108v24 = AbstractC3122is.m14108v(ik8VarMo2873e1, "studyTime");
                    if (ik8VarMo2873e1.mo2876a0()) {
                        String strMo2875L = ik8VarMo2873e1.mo2875L(iM14108v);
                        String strMo2875L2 = ik8VarMo2873e1.mo2875L(iM14108v2);
                        int i4 = (int) ik8VarMo2873e1.getLong(iM14108v3);
                        double d = ik8VarMo2873e1.getDouble(iM14108v4);
                        int i5 = (int) ik8VarMo2873e1.getLong(iM14108v5);
                        double d2 = ik8VarMo2873e1.getDouble(iM14108v6);
                        int i6 = (int) ik8VarMo2873e1.getLong(iM14108v7);
                        int i7 = (int) ik8VarMo2873e1.getLong(iM14108v8);
                        int i8 = (int) ik8VarMo2873e1.getLong(iM14108v9);
                        double d3 = ik8VarMo2873e1.getDouble(iM14108v10);
                        double d4 = ik8VarMo2873e1.getDouble(iM14108v11);
                        int i9 = (int) ik8VarMo2873e1.getLong(iM14108v12);
                        int i10 = (int) ik8VarMo2873e1.getLong(iM14108v13);
                        List listM20058M = c1319g.f17028M.m20058M(ik8VarMo2873e1.isNull(iM14108v14) ? null : ik8VarMo2873e1.mo2875L(iM14108v14));
                        if (listM20058M == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        languageProgress = new LanguageProgress(strMo2875L, strMo2875L2, i4, d, i5, d2, i6, i7, i8, d3, d4, i9, i10, listM20058M, (int) ik8VarMo2873e1.getLong(iM14108v15), (int) ik8VarMo2873e1.getLong(iM14108v16), ik8VarMo2873e1.getDouble(iM14108v17), (int) ik8VarMo2873e1.getLong(iM14108v18), (int) ik8VarMo2873e1.getLong(iM14108v19), (int) ik8VarMo2873e1.getLong(iM14108v20), (int) ik8VarMo2873e1.getLong(iM14108v21), (int) ik8VarMo2873e1.getLong(iM14108v22), (int) ik8VarMo2873e1.getLong(iM14108v23), (int) ik8VarMo2873e1.getLong(iM14108v24));
                    } else {
                        languageProgress = null;
                    }
                    ik8VarMo2873e1.close();
                    return languageProgress;
                } catch (Throwable th3) {
                    ik8VarMo2873e1.close();
                    throw th3;
                }
            case 10:
                ub5 ub5Var2 = (ub5) obj3;
                final ac5 ac5Var = (ac5) obj2;
                final vi3 vi3Var2 = (vi3) obj4;
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                rb5 rb5Var = new rb5() { // from class: ob5
                    @Override // p000.rb5
                    /* JADX INFO: renamed from: c */
                    public final void mo399c(ub5 ub5Var3, Lifecycle$Event lifecycle$Event) {
                        int i11 = qb5.f57542a[lifecycle$Event.ordinal()];
                        Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                        if (i11 == 1) {
                            ref$ObjectRef2.f47718a = vi3Var2.invoke(ac5Var);
                        } else {
                            if (i11 != 2) {
                                return;
                            }
                            bc5 bc5Var = (bc5) ref$ObjectRef2.f47718a;
                            if (bc5Var != null) {
                                bc5Var.mo3608a();
                            }
                            ref$ObjectRef2.f47718a = null;
                        }
                    }
                };
                ub5Var2.mo256K().mo21323g(rb5Var);
                return new C3080hm(ub5Var2, rb5Var, ref$ObjectRef, i3);
            case 11:
                zi3 zi3Var = (zi3) obj4;
                t66 t66Var2 = (t66) obj3;
                t66 t66Var3 = (t66) obj2;
                ((fj4) obj).getClass();
                if (((vv9) t66Var2.getValue()).f65990a.f54604b.length() > 0 && ((vv9) t66Var3.getValue()).f65990a.f54604b.length() > 0) {
                    zi3Var.invoke(((vv9) t66Var2.getValue()).f65990a.f54604b, ((vv9) t66Var3.getValue()).f65990a.f54604b);
                }
                return xfaVar;
            case 12:
                t17 t17Var = (t17) obj3;
                InterfaceC3457pe interfaceC3457pe = (InterfaceC3457pe) obj2;
                C0358h c0358h = (C0358h) obj;
                long j9 = ((x89) ((MutablePropertyReference0) ((ui3) obj4)).get()).f67935a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                if (fIntBitsToFloat > 0.0f) {
                    float fMo912g0 = c0358h.mo912g0(4.0f);
                    an0 an0Var = c0358h.f4358a;
                    float fMo912g1 = c0358h.mo912g0(t17Var.mo14019b(c0358h.getLayoutDirection()));
                    float fMo4499a = interfaceC3457pe.mo4499a(ss5.m21693T(fIntBitsToFloat), ss5.m21693T((Float.intBitsToFloat((int) (an0Var.mo1422h() >> 32)) - fMo912g1) - c0358h.mo912g0(t17Var.mo14020c(c0358h.getLayoutDirection()))), c0358h.getLayoutDirection()) + fMo912g1;
                    float f11 = fIntBitsToFloat / 2.0f;
                    float f12 = fMo4499a + f11;
                    float f13 = (f12 - f11) - fMo912g0;
                    float f14 = f13 < 0.0f ? 0.0f : f13;
                    float f15 = f12 + f11 + fMo912g0;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (an0Var.mo1422h() >> 32));
                    float f16 = f15 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f15;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                    float f17 = (-fIntBitsToFloat3) / 2.0f;
                    float f18 = fIntBitsToFloat3 / 2.0f;
                    C3309ls c3309ls = an0Var.f853b;
                    long jM16483A2 = c3309ls.m16483A();
                    c3309ls.m16515r().mo17016h();
                    try {
                        ((qn3) c3309ls.f50064b).m20070k(f14, f17, f16, f18, 0);
                        c0358h.m1614b();
                    } finally {
                        AbstractC3393o1.m17751z(c3309ls, jM16483A2);
                    }
                } else {
                    c0358h.m1614b();
                }
                return xfaVar;
            case 13:
                gl8 gl8Var = (gl8) obj4;
                ll8 ll8Var = (ll8) obj2;
                n66 n66Var = gl8Var.f40975b;
                if (n66Var.m17250b(obj3)) {
                    v63.m23135m("Key ", obj3, " was used multiple times ");
                    return null;
                }
                gl8Var.f40974a.remove(obj3);
                n66Var.m17261m(obj3, ll8Var);
                return new C3080hm(gl8Var, obj3, ll8Var, i2);
            case 14:
                return SimpleActor._init_$lambda$0((vi3) obj4, (SimpleActor) obj3, (zi3) obj2, (Throwable) obj);
            case 15:
                eeb eebVar = (eeb) obj3;
                vi3 vi3Var3 = (vi3) obj4;
                vi3 vi3Var4 = (vi3) obj2;
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                Intent intent = activityResult.f1008b;
                if (intent != null) {
                    try {
                        String strM5268r = eebVar.m11082e(intent).m5268r();
                        if (strM5268r != null) {
                            vi3Var3.invoke(strM5268r);
                        } else {
                            vi3Var4.invoke("Google sign-in failed: No auth code received");
                        }
                    } catch (ApiException e) {
                        if (e.f11645a.f11662a != 16) {
                            String message = e.getMessage();
                            if (message == null) {
                                message = "Unknown error";
                            }
                            vi3Var4.invoke("Google sign-in failed: ".concat(message));
                        }
                    }
                    break;
                }
                return xfaVar;
            case 16:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj4;
                C3378nn c3378nn2 = (C3378nn) obj3;
                he9 he9Var2 = (he9) obj2;
                C3378nn c3378nn3 = (C3378nn) obj;
                if (ref$BooleanRef.f47713a) {
                    Object obj5 = c3378nn3.f52979a;
                    int i11 = c3378nn3.f52981c;
                    int i12 = c3378nn3.f52980b;
                    if ((obj5 instanceof he9) && i12 == c3378nn2.f52980b && i11 == c3378nn2.f52981c) {
                        if (he9Var2 == null) {
                            he9Var2 = new he9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                        }
                        c3378nn = new C3378nn(he9Var2, i12, i11);
                    } else {
                        c3378nn = c3378nn3;
                    }
                } else {
                    c3378nn = c3378nn3;
                }
                ref$BooleanRef.f47713a = c3378nn2.equals(c3378nn3);
                return c3378nn;
            case 17:
                vi3 vi3Var5 = (vi3) obj4;
                hw9 hw9Var = (hw9) ((Ref$ObjectRef) obj2).f47718a;
                vv9 vv9VarM3856m = ((bl2) obj3).m3856m((List) obj);
                if (hw9Var != null) {
                    hw9Var.m13542a(null, vv9VarM3856m);
                }
                vi3Var5.invoke(vv9VarM3856m);
                return xfaVar;
            case 18:
                return m3549d(obj);
            default:
                y27 y27Var = (y27) obj4;
                y27 y27Var2 = (y27) obj3;
                y27 y27Var3 = (y27) obj2;
                AbstractC3387nw abstractC3387nw = (AbstractC3387nw) obj;
                if (abstractC3387nw instanceof C3313lw) {
                    return y27Var != null ? new C3313lw(y27Var) : (C3313lw) abstractC3387nw;
                }
                if (!(abstractC3387nw instanceof C3276kw)) {
                    return abstractC3387nw;
                }
                C3276kw c3276kw = (C3276kw) abstractC3387nw;
                kt2 kt2Var = c3276kw.f48489b;
                if (kt2Var.f48407c instanceof NullRequestDataException) {
                    return y27Var2 != null ? new C3276kw(y27Var2, kt2Var) : c3276kw;
                }
                return y27Var3 != null ? new C3276kw(y27Var3, kt2Var) : c3276kw;
        }
    }

    public /* synthetic */ bb0(int i, vi3 vi3Var, Object obj, Object obj2) {
        this.f8261a = i;
        this.f8263c = obj;
        this.f8262b = vi3Var;
        this.f8264d = obj2;
    }

    public /* synthetic */ bb0(C0098f c0098f, C0119y c0119y, cd4 cd4Var, ho8 ho8Var) {
        this.f8261a = 2;
        this.f8262b = c0098f;
        this.f8263c = cd4Var;
        this.f8264d = ho8Var;
    }

    public /* synthetic */ bb0(Object obj, Object obj2, Object obj3, int i) {
        this.f8261a = i;
        this.f8262b = obj;
        this.f8263c = obj2;
        this.f8264d = obj3;
    }

    public /* synthetic */ bb0(Ref$FloatRef ref$FloatRef, wn8 wn8Var, Ref$FloatRef ref$FloatRef2, C0100h c0100h) {
        this.f8261a = 5;
        this.f8262b = ref$FloatRef;
        this.f8263c = wn8Var;
        this.f8264d = ref$FloatRef2;
    }
}

package androidx.compose.foundation.text.selection;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import androidx.compose.foundation.text.HandleState;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3489q9;
import p000.C3341mn;
import p000.C3378nn;
import p000.C3386nv;
import p000.C3419on;
import p000.C3610tg;
import p000.aa1;
import p000.bc3;
import p000.c32;
import p000.cx9;
import p000.eh0;
import p000.fa4;
import p000.h32;
import p000.he9;
import p000.l39;
import p000.oa0;
import p000.rt9;
import p000.s31;
import p000.t31;
import p000.un1;
import p000.vz1;
import p000.wb3;
import p000.xb3;
import p000.xfa;
import p000.yv9;
import p000.zi3;
import p000.zx9;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", m4291f = "TextFieldSelectionManager.kt", m4292l = {928, 928}, m4293m = "invokeSuspend", m4294v = 1)
final class TextFieldSelectionManager$paste$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3050a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0205f f3051b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$paste$1(C0205f c0205f, Continuation continuation) {
        super(2, continuation);
        this.f3051b = c0205f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextFieldSelectionManager$paste$1(this.f3051b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionManager$paste$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x02d7, code lost:
    
        if (r0 == r1) goto L142;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object s31Var;
        xfa xfaVar;
        Object c3419on;
        CharSequence text;
        CharSequence charSequence;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f3050a;
        xfa xfaVar2 = xfa.f68157a;
        C0205f c0205f = this.f3051b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            t31 t31Var = c0205f.f3083h;
            if (t31Var != null) {
                this.f3050a = 1;
                ClipData primaryClip = ((C3610tg) t31Var).f62240a.m3360m().getPrimaryClip();
                s31Var = primaryClip != null ? new s31(primaryClip) : null;
                if (s31Var != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return xfaVar2;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(obj);
            s31Var = obj;
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            c3419on = obj;
            xfaVar = xfaVar2;
        }
        C3419on c3419on2 = (C3419on) c3419on;
        if (c3419on2 == null || !c0205f.m1110k()) {
            return xfaVar;
        }
        C3341mn c3341mn = new C3341mn(AbstractC3489q9.m19786p(c0205f.m1114o(), c0205f.m1114o().f65990a.f54604b.length()));
        c3341mn.m16928c(c3419on2);
        C3419on c3419onM16933h = c3341mn.m16933h();
        C3419on c3419onM19785o = AbstractC3489q9.m19785o(c0205f.m1114o(), c0205f.m1114o().f65990a.f54604b.length());
        C3341mn c3341mn2 = new C3341mn(c3419onM16933h);
        c3341mn2.m16928c(c3419onM19785o);
        C3419on c3419onM16933h2 = c3341mn2.m16933h();
        int length = c3419on2.f54604b.length() + cx9.m9924f(c0205f.m1114o().f65991b);
        c0205f.f3078c.invoke(C0205f.m1103e(c3419onM16933h2, eh0.m11127g(length, length)));
        c0205f.m1117r(HandleState.None);
        c0205f.f3076a.f59213e = true;
        return xfaVar;
        s31 s31Var2 = (s31) s31Var;
        if (s31Var2 != null) {
            this.f3050a = 2;
            int i3 = 0;
            ClipData.Item itemAt = s31Var2.m21043a().getItemAt(0);
            if (itemAt == null || (text = itemAt.getText()) == null) {
                xfaVar = xfaVar2;
                c3419on = null;
            } else if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                ArrayList arrayList = new ArrayList();
                annotationArr.getClass();
                int length2 = annotationArr.length - 1;
                if (length2 >= 0) {
                    int i4 = 0;
                    while (true) {
                        Annotation annotation = annotationArr[i4];
                        if (fa4.m11650l(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                            int spanStart = spanned.getSpanStart(annotation);
                            int spanEnd = spanned.getSpanEnd(annotation);
                            String value = annotation.getValue();
                            h32 h32Var = new h32();
                            Parcel parcelObtain = Parcel.obtain();
                            h32Var.f41744a = parcelObtain;
                            byte[] bArrDecode = Base64.decode(value, i3);
                            parcelObtain.unmarshall(bArrDecode, i3, bArrDecode.length);
                            parcelObtain.setDataPosition(i3);
                            Parcel parcel = h32Var.f41744a;
                            long jM13017a = aa1.f412k;
                            long jM13017a2 = jM13017a;
                            long jM13018b = zx9.f72359c;
                            long jM13018b2 = jM13018b;
                            bc3 bc3Var = null;
                            wb3 wb3Var = null;
                            xb3 xb3Var = null;
                            String string = null;
                            oa0 oa0Var = null;
                            yv9 yv9Var = null;
                            rt9 rt9Var = null;
                            l39 l39Var = null;
                            while (true) {
                                if (parcel.dataAvail() <= 1) {
                                    charSequence = text;
                                    i3 = i3;
                                    break;
                                }
                                byte b = parcel.readByte();
                                i3 = i3;
                                if (b != 1) {
                                    if (b != 2) {
                                        if (b != 3) {
                                            if (b != 4) {
                                                if (b != 5) {
                                                    if (b != 6) {
                                                        if (b != 7) {
                                                            if (b != 8) {
                                                                if (b != 9) {
                                                                    if (b != 10) {
                                                                        if (b != 11) {
                                                                            charSequence = text;
                                                                            if (b == 12) {
                                                                                if (parcel.dataAvail() < 20) {
                                                                                    break;
                                                                                }
                                                                                text = charSequence;
                                                                                xfaVar2 = xfaVar2;
                                                                                l39Var = new l39(h32Var.m13017a(), (((long) Float.floatToRawIntBits(parcel.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcel.readFloat())) & 4294967295L), parcel.readFloat());
                                                                            }
                                                                        } else if (parcel.dataAvail() >= 4) {
                                                                            int i5 = parcel.readInt();
                                                                            int i6 = (i5 & 2) != 0 ? 1 : i3;
                                                                            int i7 = (i5 & 1) != 0 ? 1 : i3;
                                                                            rt9 rt9Var2 = rt9.f59803d;
                                                                            charSequence = text;
                                                                            rt9 rt9Var3 = rt9.f59802c;
                                                                            if (i6 != 0 && i7 != 0) {
                                                                                List listM23605K = vz1.m23605K(rt9Var2, rt9Var3);
                                                                                Integer numValueOf = Integer.valueOf(i3);
                                                                                int size = listM23605K.size();
                                                                                int i8 = i3;
                                                                                while (i8 < size) {
                                                                                    numValueOf = Integer.valueOf(((rt9) listM23605K.get(i8)).f59804a | numValueOf.intValue());
                                                                                    i8++;
                                                                                    listM23605K = listM23605K;
                                                                                }
                                                                                rt9Var = new rt9(numValueOf.intValue());
                                                                            } else if (i6 != 0) {
                                                                                rt9Var = rt9Var2;
                                                                            } else {
                                                                                if (i7 == 0) {
                                                                                    rt9Var3 = rt9.f59801b;
                                                                                }
                                                                                rt9Var = rt9Var3;
                                                                            }
                                                                        }
                                                                        text = charSequence;
                                                                    } else if (parcel.dataAvail() >= 8) {
                                                                        jM13017a2 = h32Var.m13017a();
                                                                    }
                                                                    charSequence = text;
                                                                    break;
                                                                }
                                                                if (parcel.dataAvail() < 8) {
                                                                    charSequence = text;
                                                                    break;
                                                                }
                                                                yv9Var = new yv9(parcel.readFloat(), parcel.readFloat());
                                                            } else {
                                                                if (parcel.dataAvail() < 4) {
                                                                    charSequence = text;
                                                                    break;
                                                                }
                                                                oa0Var = new oa0(parcel.readFloat());
                                                            }
                                                        } else {
                                                            if (parcel.dataAvail() < 5) {
                                                                charSequence = text;
                                                                break;
                                                            }
                                                            jM13018b2 = h32Var.m13018b();
                                                        }
                                                    } else {
                                                        string = parcel.readString();
                                                    }
                                                } else {
                                                    if (parcel.dataAvail() < 1) {
                                                        charSequence = text;
                                                        break;
                                                    }
                                                    byte b2 = parcel.readByte();
                                                    if (b2 == 0) {
                                                        i = i3;
                                                    } else if (b2 == 1) {
                                                        i = 65535;
                                                    } else {
                                                        if (b2 == 3) {
                                                            i = 2;
                                                        } else {
                                                            i = b2 == 2 ? 1 : i3;
                                                        }
                                                        xb3Var = new xb3(i);
                                                    }
                                                    xb3Var = new xb3(i);
                                                }
                                            } else {
                                                if (parcel.dataAvail() < 1) {
                                                    charSequence = text;
                                                    break;
                                                }
                                                byte b3 = parcel.readByte();
                                                wb3Var = new wb3((b3 != 0 && b3 == 1) ? 1 : i3);
                                            }
                                        } else {
                                            if (parcel.dataAvail() < 4) {
                                                charSequence = text;
                                                break;
                                            }
                                            bc3Var = new bc3(parcel.readInt());
                                        }
                                    } else {
                                        if (parcel.dataAvail() < 5) {
                                            charSequence = text;
                                            break;
                                        }
                                        jM13018b = h32Var.m13018b();
                                    }
                                } else {
                                    if (parcel.dataAvail() < 8) {
                                        charSequence = text;
                                        break;
                                    }
                                    jM13017a = h32Var.m13017a();
                                }
                            }
                            xfaVar = xfaVar2;
                            arrayList.add(new C3378nn(new he9(jM13017a, jM13018b, bc3Var, wb3Var, xb3Var, null, string, jM13018b2, oa0Var, yv9Var, null, jM13017a2, rt9Var, l39Var, 49152), spanStart, spanEnd));
                        } else {
                            charSequence = text;
                            i3 = i3;
                            xfaVar = xfaVar2;
                        }
                        if (i4 == length2) {
                            break;
                        }
                        i4++;
                        i3 = i3;
                        text = charSequence;
                        xfaVar2 = xfaVar;
                    }
                } else {
                    charSequence = text;
                    i3 = 0;
                    xfaVar = xfaVar2;
                }
                c3419on = new C3419on(i3, charSequence.toString(), arrayList);
            } else {
                c3419on = new C3419on(text.toString());
                xfaVar = xfaVar2;
            }
        }
        return xfaVar2;
    }
}

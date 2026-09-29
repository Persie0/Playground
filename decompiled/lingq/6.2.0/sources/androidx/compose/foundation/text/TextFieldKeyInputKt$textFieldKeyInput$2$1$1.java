package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import p000.AbstractC3122is;
import p000.C3419on;
import p000.a32;
import p000.ahd;
import p000.bb0;
import p000.bi4;
import p000.bna;
import p000.bx9;
import p000.cc4;
import p000.chd;
import p000.cx9;
import p000.fa4;
import p000.hb1;
import p000.hv9;
import p000.rfa;
import p000.rh4;
import p000.uu9;
import p000.vi3;
import p000.vv9;
import p000.vz1;
import p000.wfb;
import p000.zgd;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class TextFieldKeyInputKt$textFieldKeyInput$2$1$1 extends FunctionReferenceImpl implements vi3 {
    /* JADX WARN: Code duplicated, block: B:114:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:20:0x0079  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:329:0x059a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:69:0x0157  */
    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        hb1 hb1Var;
        KeyCommand keyCommand;
        cc4 cc4Var;
        KeyCommand keyCommand2;
        KeyCommand keyCommand3;
        Integer numValueOf;
        KeyEvent keyEventM3729b = ((bi4) obj).m3729b();
        uu9 uu9Var = (uu9) this.f47704b;
        bx9 bx9Var = uu9Var.f64376f;
        boolean z = uu9Var.f64374d;
        boolean z2 = true;
        if (keyEventM3729b.getAction() != 0 || Character.isISOControl(keyEventM3729b.getUnicodeChar())) {
            hb1Var = null;
        } else {
            a32 a32Var = uu9Var.f64379i;
            a32Var.getClass();
            int iM4669c = chd.m4669c(keyEventM3729b);
            if ((Integer.MIN_VALUE & iM4669c) != 0) {
                a32Var.f170a = Integer.valueOf(iM4669c & Integer.MAX_VALUE);
                numValueOf = null;
            } else {
                Integer num = a32Var.f170a;
                if (num != null) {
                    a32Var.f170a = null;
                    int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), iM4669c);
                    Integer numValueOf2 = Integer.valueOf(deadChar);
                    if (deadChar == 0) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        iM4669c = numValueOf2.intValue();
                    }
                    numValueOf = Integer.valueOf(iM4669c);
                } else {
                    numValueOf = Integer.valueOf(iM4669c);
                }
            }
            if (numValueOf != null) {
                hb1Var = new hb1(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
            } else {
                hb1Var = null;
            }
        }
        if (hb1Var != null) {
            if (z) {
                uu9Var.m22943a(vz1.m23604J(hb1Var));
                bx9Var.f9149a = null;
            } else {
                z2 = false;
            }
        } else if (ahd.m421a(chd.m4668b(keyEventM3729b), 2)) {
            uu9Var.f64380j.getClass();
            int iM23922q = wfb.m23922q(keyEventM3729b);
            int i = bna.f8743p;
            if (iM23922q == 9) {
                long jM4667a = chd.m4667a(keyEventM3729b);
                int i2 = rh4.f59280O;
                if (rh4.m20661a(jM4667a, zgd.m25640k())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (rh4.m20661a(jM4667a, zgd.m25641l())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (rh4.m20661a(jM4667a, zgd.m25642m())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (rh4.m20661a(jM4667a, zgd.m25639j())) {
                    keyCommand = KeyCommand.SELECT_END;
                } else {
                    keyCommand = null;
                }
            } else if (iM23922q == 1) {
                long jM4667a2 = chd.m4667a(keyEventM3729b);
                int i3 = rh4.f59280O;
                if (rh4.m20661a(jM4667a2, zgd.m25640k())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (rh4.m20661a(jM4667a2, zgd.m25641l())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (rh4.m20661a(jM4667a2, zgd.m25642m())) {
                    keyCommand = KeyCommand.HOME;
                } else if (rh4.m20661a(jM4667a2, zgd.m25639j())) {
                    keyCommand = KeyCommand.END;
                } else if (rh4.m20661a(jM4667a2, zgd.m25633d())) {
                    keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                } else {
                    keyCommand = null;
                }
            } else {
                keyCommand = null;
            }
            if (keyCommand == null) {
                cc4 cc4Var2 = AbstractC3122is.f44469b;
                int i4 = bna.f8744q;
                int iM23922q2 = wfb.m23922q(keyEventM3729b);
                long jM4667a3 = chd.m4667a(keyEventM3729b);
                int i5 = rh4.f59280O;
                if (rh4.m20661a(jM4667a3, zgd.m25633d())) {
                    if (iM23922q2 == 0 || iM23922q2 == 8) {
                        keyCommand2 = KeyCommand.DELETE_PREV_CHAR;
                    } else {
                        int i6 = bna.f8745r;
                        if (iM23922q2 == 12) {
                            keyCommand2 = KeyCommand.DELETE_PREV_CHAR;
                        } else {
                            keyCommand2 = (iM23922q2 == 2 || iM23922q2 == 10) ? KeyCommand.DELETE_PREV_WORD : null;
                        }
                    }
                    cc4Var = cc4Var2;
                } else {
                    cc4Var = cc4Var2;
                    keyCommand2 = ((rh4.m20661a(jM4667a3, zgd.m25643n()) || rh4.m20661a(jM4667a3, zgd.m25655z())) && (iM23922q2 == 0 || iM23922q2 == 8 || iM23922q2 == 2 || iM23922q2 == 10)) ? KeyCommand.NEW_LINE : null;
                }
                if (keyCommand2 != null) {
                    keyCommand = keyCommand2;
                } else {
                    int iM23922q3 = wfb.m23922q(keyEventM3729b);
                    if (iM23922q3 == 10) {
                        long jM4667a4 = chd.m4667a(keyEventM3729b);
                        if (rh4.m20661a(jM4667a4, zgd.m25640k()) || rh4.m20661a(jM4667a4, zgd.m25652w())) {
                            keyCommand3 = KeyCommand.SELECT_LEFT_WORD;
                        } else if (rh4.m20661a(jM4667a4, zgd.m25641l()) || rh4.m20661a(jM4667a4, zgd.m25653x())) {
                            keyCommand3 = KeyCommand.SELECT_RIGHT_WORD;
                        } else if (rh4.m20661a(jM4667a4, zgd.m25642m()) || rh4.m20661a(jM4667a4, zgd.m25654y())) {
                            keyCommand3 = KeyCommand.SELECT_PREV_PARAGRAPH;
                        } else if (rh4.m20661a(jM4667a4, zgd.m25639j()) || rh4.m20661a(jM4667a4, zgd.m25651v())) {
                            keyCommand3 = KeyCommand.SELECT_NEXT_PARAGRAPH;
                        } else {
                            keyCommand3 = null;
                        }
                    } else if (iM23922q3 == 2) {
                        long jM4667a5 = chd.m4667a(keyEventM3729b);
                        if (rh4.m20661a(jM4667a5, zgd.m25640k()) || rh4.m20661a(jM4667a5, zgd.m25652w())) {
                            keyCommand3 = KeyCommand.LEFT_WORD;
                        } else if (rh4.m20661a(jM4667a5, zgd.m25641l()) || rh4.m20661a(jM4667a5, zgd.m25653x())) {
                            keyCommand3 = KeyCommand.RIGHT_WORD;
                        } else if (rh4.m20661a(jM4667a5, zgd.m25642m()) || rh4.m20661a(jM4667a5, zgd.m25654y())) {
                            keyCommand3 = KeyCommand.PREV_PARAGRAPH;
                        } else if (rh4.m20661a(jM4667a5, zgd.m25639j()) || rh4.m20661a(jM4667a5, zgd.m25651v())) {
                            keyCommand3 = KeyCommand.NEXT_PARAGRAPH;
                        } else if (rh4.m20661a(jM4667a5, zgd.m25645p())) {
                            keyCommand3 = KeyCommand.DELETE_PREV_CHAR;
                        } else if (rh4.m20661a(jM4667a5, zgd.m25637h())) {
                            keyCommand3 = KeyCommand.DELETE_NEXT_WORD;
                        } else if (rh4.m20661a(jM4667a5, zgd.m25632c())) {
                            keyCommand3 = KeyCommand.DESELECT;
                        } else {
                            keyCommand3 = null;
                        }
                    } else if (iM23922q3 == 8) {
                        long jM4667a6 = chd.m4667a(keyEventM3729b);
                        if (rh4.m20661a(jM4667a6, zgd.m25648s()) || rh4.m20661a(jM4667a6, zgd.m25618C())) {
                            keyCommand3 = KeyCommand.SELECT_LINE_START;
                        } else if (rh4.m20661a(jM4667a6, zgd.m25647r()) || rh4.m20661a(jM4667a6, zgd.m25617B())) {
                            keyCommand3 = KeyCommand.SELECT_LINE_END;
                        } else {
                            keyCommand3 = null;
                        }
                    } else if (iM23922q3 == 1 && rh4.m20661a(chd.m4667a(keyEventM3729b), zgd.m25637h())) {
                        keyCommand3 = KeyCommand.DELETE_TO_LINE_END;
                    } else {
                        keyCommand3 = null;
                    }
                    if (keyCommand3 == null) {
                        Object obj2 = cc4Var.f9881a;
                        int iM23922q4 = wfb.m23922q(keyEventM3729b);
                        if (iM23922q4 == 10) {
                            long jM4667a7 = chd.m4667a(keyEventM3729b);
                            int i7 = rh4.f59280O;
                            if (rh4.m20661a(jM4667a7, zgd.m25629N())) {
                                keyCommand3 = KeyCommand.REDO;
                            } else {
                                keyCommand3 = null;
                            }
                        } else if (iM23922q4 == 2) {
                            long jM4667a8 = chd.m4667a(keyEventM3729b);
                            int i8 = rh4.f59280O;
                            if (rh4.m20661a(jM4667a8, zgd.m25634e()) || rh4.m20661a(jM4667a8, zgd.m25646q()) || rh4.m20661a(jM4667a8, zgd.m25616A())) {
                                keyCommand3 = KeyCommand.COPY;
                            } else if (rh4.m20661a(jM4667a8, zgd.m25626K())) {
                                keyCommand3 = KeyCommand.PASTE;
                            } else if (rh4.m20661a(jM4667a8, zgd.m25627L())) {
                                keyCommand3 = KeyCommand.CUT;
                            } else if (rh4.m20661a(jM4667a8, zgd.m25630a())) {
                                keyCommand3 = KeyCommand.SELECT_ALL;
                            } else if (rh4.m20661a(jM4667a8, zgd.m25628M())) {
                                keyCommand3 = KeyCommand.REDO;
                            } else if (rh4.m20661a(jM4667a8, zgd.m25629N())) {
                                keyCommand3 = KeyCommand.UNDO;
                            } else {
                                keyCommand3 = null;
                            }
                        } else if (iM23922q4 == 8) {
                            long jM4667a9 = chd.m4667a(keyEventM3729b);
                            int i9 = rh4.f59280O;
                            if (rh4.m20661a(jM4667a9, zgd.m25640k()) || rh4.m20661a(jM4667a9, zgd.m25652w())) {
                                keyCommand3 = KeyCommand.SELECT_LEFT_CHAR;
                            } else if (rh4.m20661a(jM4667a9, zgd.m25641l()) || rh4.m20661a(jM4667a9, zgd.m25653x())) {
                                keyCommand3 = KeyCommand.SELECT_RIGHT_CHAR;
                            } else if (rh4.m20661a(jM4667a9, zgd.m25642m()) || rh4.m20661a(jM4667a9, zgd.m25654y())) {
                                keyCommand3 = KeyCommand.SELECT_UP;
                            } else if (rh4.m20661a(jM4667a9, zgd.m25639j()) || rh4.m20661a(jM4667a9, zgd.m25651v())) {
                                keyCommand3 = KeyCommand.SELECT_DOWN;
                            } else if (rh4.m20661a(jM4667a9, zgd.m25622G()) || rh4.m20661a(jM4667a9, zgd.m25620E())) {
                                keyCommand3 = KeyCommand.SELECT_PAGE_UP;
                            } else if (rh4.m20661a(jM4667a9, zgd.m25621F()) || rh4.m20661a(jM4667a9, zgd.m25619D())) {
                                keyCommand3 = KeyCommand.SELECT_PAGE_DOWN;
                            } else if (rh4.m20661a(jM4667a9, zgd.m25648s()) || rh4.m20661a(jM4667a9, zgd.m25618C())) {
                                keyCommand3 = KeyCommand.SELECT_LINE_START;
                            } else if (rh4.m20661a(jM4667a9, zgd.m25647r()) || rh4.m20661a(jM4667a9, zgd.m25617B())) {
                                keyCommand3 = KeyCommand.SELECT_LINE_END;
                            } else if (rh4.m20661a(jM4667a9, zgd.m25646q()) || rh4.m20661a(jM4667a9, zgd.m25616A())) {
                                keyCommand3 = KeyCommand.PASTE;
                            } else {
                                keyCommand3 = null;
                            }
                        } else if (iM23922q4 == 0) {
                            long jM4667a10 = chd.m4667a(keyEventM3729b);
                            int i10 = rh4.f59280O;
                            if (rh4.m20661a(jM4667a10, zgd.m25640k()) || rh4.m20661a(jM4667a10, zgd.m25652w())) {
                                keyCommand3 = KeyCommand.LEFT_CHAR;
                            } else if (rh4.m20661a(jM4667a10, zgd.m25641l()) || rh4.m20661a(jM4667a10, zgd.m25653x())) {
                                keyCommand3 = KeyCommand.RIGHT_CHAR;
                            } else if (rh4.m20661a(jM4667a10, zgd.m25642m()) || rh4.m20661a(jM4667a10, zgd.m25654y())) {
                                keyCommand3 = KeyCommand.UP;
                            } else if (rh4.m20661a(jM4667a10, zgd.m25639j()) || rh4.m20661a(jM4667a10, zgd.m25651v())) {
                                keyCommand3 = KeyCommand.DOWN;
                            } else if (rh4.m20661a(jM4667a10, zgd.m25638i())) {
                                keyCommand3 = KeyCommand.CENTER;
                            } else if (rh4.m20661a(jM4667a10, zgd.m25622G()) || rh4.m20661a(jM4667a10, zgd.m25620E())) {
                                keyCommand3 = KeyCommand.PAGE_UP;
                            } else if (rh4.m20661a(jM4667a10, zgd.m25621F()) || rh4.m20661a(jM4667a10, zgd.m25619D())) {
                                keyCommand3 = KeyCommand.PAGE_DOWN;
                            } else if (rh4.m20661a(jM4667a10, zgd.m25648s()) || rh4.m20661a(jM4667a10, zgd.m25618C())) {
                                keyCommand3 = KeyCommand.LINE_START;
                            } else if (rh4.m20661a(jM4667a10, zgd.m25647r()) || rh4.m20661a(jM4667a10, zgd.m25617B())) {
                                keyCommand3 = KeyCommand.LINE_END;
                            } else if (rh4.m20661a(jM4667a10, zgd.m25643n()) || rh4.m20661a(jM4667a10, zgd.m25655z())) {
                                keyCommand3 = KeyCommand.NEW_LINE;
                            } else if (rh4.m20661a(jM4667a10, zgd.m25633d())) {
                                keyCommand3 = KeyCommand.DELETE_PREV_CHAR;
                            } else if (rh4.m20661a(jM4667a10, zgd.m25637h())) {
                                keyCommand3 = KeyCommand.DELETE_NEXT_CHAR;
                            } else if (rh4.m20661a(jM4667a10, zgd.m25623H())) {
                                keyCommand3 = KeyCommand.PASTE;
                            } else if (rh4.m20661a(jM4667a10, zgd.m25636g())) {
                                keyCommand3 = KeyCommand.CUT;
                            } else if (rh4.m20661a(jM4667a10, zgd.m25635f())) {
                                keyCommand3 = KeyCommand.COPY;
                            } else if (rh4.m20661a(jM4667a10, zgd.m25625J())) {
                                keyCommand3 = KeyCommand.TAB;
                            } else {
                                keyCommand3 = null;
                            }
                        } else {
                            keyCommand3 = null;
                        }
                    }
                    keyCommand = keyCommand3;
                }
            }
            if (keyCommand == null || (keyCommand.getEditsText() && !z)) {
                z2 = false;
            } else {
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                ref$BooleanRef.f47713a = true;
                bb0 bb0Var = new bb0(keyCommand, uu9Var, ref$BooleanRef, 18);
                vv9 vv9Var = uu9Var.f64373c;
                hv9 hv9Var = new hv9(vv9Var, uu9Var.f64377g, uu9Var.f64371a.m25363d(), bx9Var);
                bb0Var.invoke(hv9Var);
                boolean zM9920b = cx9.m9920b(hv9Var.f43000f, vv9Var.f65991b);
                C3419on c3419on = hv9Var.f43001g;
                if (!zM9920b || !fa4.m11650l(c3419on, vv9Var.f65990a)) {
                    uu9Var.f64381k.invoke(vv9.m23560a(vv9Var, c3419on, hv9Var.f43000f, 4));
                }
                rfa rfaVar = uu9Var.f64378h;
                if (rfaVar != null) {
                    rfaVar.f59213e = true;
                }
                z2 = ref$BooleanRef.f47713a;
            }
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}

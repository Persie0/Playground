package p000;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import com.google.lens.sdk.LensApi;
import java.util.ArrayList;
import java.util.Iterator;
import p000.akq;
import p000.akv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jew {

    /* JADX INFO: renamed from: a */
    public int f33846a;

    /* JADX INFO: renamed from: b */
    public final Object f33847b;

    /* JADX INFO: renamed from: c */
    public final Object f33848c;

    /* JADX INFO: renamed from: d */
    public final Object f33849d;

    /* JADX INFO: renamed from: e */
    private boolean f33850e;

    public jew(bck bckVar, C0116cv c0116cv, ComponentCallbacksC0077bw componentCallbacksC0077bw, Bundle bundle, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f33850e = false;
        this.f33846a = -1;
        this.f33847b = bckVar;
        this.f33849d = c0116cv;
        this.f33848c = componentCallbacksC0077bw;
        componentCallbacksC0077bw.f4606h = null;
        componentCallbacksC0077bw.f4607i = null;
        componentCallbacksC0077bw.f4622x = 0;
        componentCallbacksC0077bw.f4619u = false;
        componentCallbacksC0077bw.f4615q = false;
        ComponentCallbacksC0077bw componentCallbacksC0077bw2 = componentCallbacksC0077bw.f4611m;
        componentCallbacksC0077bw.f4612n = componentCallbacksC0077bw2 != null ? componentCallbacksC0077bw2.f4609k : null;
        componentCallbacksC0077bw.f4611m = null;
        componentCallbacksC0077bw.f4605g = bundle;
        componentCallbacksC0077bw.f4610l = bundle.getBundle("arguments");
    }

    public jew(bck bckVar, C0116cv c0116cv, ComponentCallbacksC0077bw componentCallbacksC0077bw, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f33850e = false;
        this.f33846a = -1;
        this.f33847b = bckVar;
        this.f33849d = c0116cv;
        this.f33848c = componentCallbacksC0077bw;
    }

    /* JADX INFO: renamed from: a */
    public final void m12998a(jev jevVar, jcu jcuVar, String str) {
        ((C1117xf) this.f33847b).put(jevVar, jcuVar);
        ((C1117xf) this.f33848c).put(jevVar, str);
        this.f33846a--;
        if (!jcuVar.m12895b()) {
            this.f33850e = true;
        }
        if (this.f33846a == 0) {
            if (this.f33850e) {
                ((khb) this.f33849d).m14242h(new jdw((C1109wy) this.f33847b));
            } else {
                ((khb) this.f33849d).m14243i(this.f33848c);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12999b() {
        View view;
        View view2;
        ComponentCallbacksC0077bw componentCallbacksC0077bwM5291f = C0111cq.m5291f(((ComponentCallbacksC0077bw) this.f33848c).f4585M);
        ComponentCallbacksC0077bw componentCallbacksC0077bw = ((ComponentCallbacksC0077bw) this.f33848c).f4574B;
        if (componentCallbacksC0077bwM5291f != null && !componentCallbacksC0077bwM5291f.equals(componentCallbacksC0077bw)) {
            Object obj = this.f33848c;
            ComponentCallbacksC0077bw componentCallbacksC0077bw2 = (ComponentCallbacksC0077bw) obj;
            int i = componentCallbacksC0077bw2.f4576D;
            int i2 = ajr.f565a;
            obj.getClass();
            akd akdVar = new akd(componentCallbacksC0077bw2, componentCallbacksC0077bwM5291f, i);
            ajr.m842d(akdVar);
            ajq ajqVarM840b = ajr.m840b(componentCallbacksC0077bw2);
            if (ajqVarM840b.f563b.contains(ajp.f556e) && ajr.m843e(ajqVarM840b, obj.getClass(), akdVar.getClass())) {
                ajr.m841c(ajqVarM840b, akdVar);
            }
        }
        Object obj2 = this.f33849d;
        Object obj3 = this.f33848c;
        ViewGroup viewGroup = ((ComponentCallbacksC0077bw) obj3).f4585M;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            C0116cv c0116cv = (C0116cv) obj2;
            int iIndexOf = c0116cv.f9743a.indexOf(obj3);
            for (int i3 = iIndexOf - 1; i3 >= 0; i3--) {
                ComponentCallbacksC0077bw componentCallbacksC0077bw3 = (ComponentCallbacksC0077bw) c0116cv.f9743a.get(i3);
                if (componentCallbacksC0077bw3.f4585M == viewGroup && (view2 = componentCallbacksC0077bw3.f4586N) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= c0116cv.f9743a.size()) {
                    break;
                }
                ComponentCallbacksC0077bw componentCallbacksC0077bw4 = (ComponentCallbacksC0077bw) c0116cv.f9743a.get(iIndexOf);
                if (componentCallbacksC0077bw4.f4585M == viewGroup && (view = componentCallbacksC0077bw4.f4586N) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        ComponentCallbacksC0077bw componentCallbacksC0077bw5 = (ComponentCallbacksC0077bw) this.f33848c;
        componentCallbacksC0077bw5.f4585M.addView(componentCallbacksC0077bw5.f4586N, iIndexOfChild);
    }

    /* JADX INFO: renamed from: c */
    final void m13000c() {
        String resourceName;
        if (((ComponentCallbacksC0077bw) this.f33848c).f4618t) {
            return;
        }
        if (C0111cq.m5275S(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATE_VIEW: ");
            sb.append(this.f33848c);
        }
        Bundle bundle = ((ComponentCallbacksC0077bw) this.f33848c).f4605g;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterM3115j = ((ComponentCallbacksC0077bw) this.f33848c).m3115j(bundle2);
        ComponentCallbacksC0077bw componentCallbacksC0077bw = (ComponentCallbacksC0077bw) this.f33848c;
        ViewGroup viewGroup2 = componentCallbacksC0077bw.f4585M;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = componentCallbacksC0077bw.f4576D;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f33848c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) componentCallbacksC0077bw.f4623y.f8790j.mo2638a(i);
                if (viewGroup == null) {
                    Object obj = this.f33848c;
                    if (!((ComponentCallbacksC0077bw) obj).f4620v) {
                        try {
                            resourceName = ((ComponentCallbacksC0077bw) obj).getResources().getResourceName(((ComponentCallbacksC0077bw) this.f33848c).f4576D);
                        } catch (Resources.NotFoundException e) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(((ComponentCallbacksC0077bw) this.f33848c).f4576D) + " (" + resourceName + ") for fragment " + this.f33848c);
                    }
                } else if (!(viewGroup instanceof C0084cc)) {
                    Object obj2 = this.f33848c;
                    int i2 = ajr.f565a;
                    obj2.getClass();
                    ComponentCallbacksC0077bw componentCallbacksC0077bw2 = (ComponentCallbacksC0077bw) obj2;
                    akc akcVar = new akc(componentCallbacksC0077bw2, viewGroup);
                    ajr.m842d(akcVar);
                    ajq ajqVarM840b = ajr.m840b(componentCallbacksC0077bw2);
                    if (ajqVarM840b.f563b.contains(ajp.DETECT_WRONG_FRAGMENT_CONTAINER) && ajr.m843e(ajqVarM840b, obj2.getClass(), akcVar.getClass())) {
                        ajr.m841c(ajqVarM840b, akcVar);
                    }
                }
            }
        }
        ComponentCallbacksC0077bw componentCallbacksC0077bw3 = (ComponentCallbacksC0077bw) this.f33848c;
        componentCallbacksC0077bw3.f4585M = viewGroup;
        componentCallbacksC0077bw3.mo2700cj(layoutInflaterM3115j, viewGroup, bundle2);
        View view = ((ComponentCallbacksC0077bw) this.f33848c).f4586N;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Object obj3 = this.f33848c;
            ((ComponentCallbacksC0077bw) obj3).f4586N.setTag(C0100R.id.fragment_container_view_tag, obj3);
            if (viewGroup != null) {
                m12999b();
            }
            ComponentCallbacksC0077bw componentCallbacksC0077bw4 = (ComponentCallbacksC0077bw) this.f33848c;
            if (componentCallbacksC0077bw4.f4578F) {
                componentCallbacksC0077bw4.f4586N.setVisibility(8);
            }
            if (afe.m461e(((ComponentCallbacksC0077bw) this.f33848c).f4586N)) {
                aff.m467c(((ComponentCallbacksC0077bw) this.f33848c).f4586N);
            } else {
                View view2 = ((ComponentCallbacksC0077bw) this.f33848c).f4586N;
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0217go(view2, 1));
            }
            ((ComponentCallbacksC0077bw) this.f33848c).m3120o();
            Object obj4 = this.f33847b;
            ComponentCallbacksC0077bw componentCallbacksC0077bw5 = (ComponentCallbacksC0077bw) this.f33848c;
            ((bck) obj4).m2203C(componentCallbacksC0077bw5, componentCallbacksC0077bw5.f4586N, bundle2, false);
            int visibility = ((ComponentCallbacksC0077bw) this.f33848c).f4586N.getVisibility();
            ((ComponentCallbacksC0077bw) this.f33848c).m3114i().f4271q = ((ComponentCallbacksC0077bw) this.f33848c).f4586N.getAlpha();
            ComponentCallbacksC0077bw componentCallbacksC0077bw6 = (ComponentCallbacksC0077bw) this.f33848c;
            if (componentCallbacksC0077bw6.f4585M != null && visibility == 0) {
                View viewFindFocus = componentCallbacksC0077bw6.f4586N.findFocus();
                if (viewFindFocus != null) {
                    ((ComponentCallbacksC0077bw) this.f33848c).m3123r(viewFindFocus);
                    if (C0111cq.m5275S(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("requestFocus: Saved focused view ");
                        sb2.append(viewFindFocus);
                        sb2.append(" for Fragment ");
                        sb2.append(this.f33848c);
                    }
                }
                ((ComponentCallbacksC0077bw) this.f33848c).f4586N.setAlpha(0.0f);
            }
        }
        ((ComponentCallbacksC0077bw) this.f33848c).f4604f = 2;
    }

    /* JADX INFO: renamed from: d */
    public final void m13001d() {
        ComponentCallbacksC0077bw componentCallbacksC0077bw = (ComponentCallbacksC0077bw) this.f33848c;
        if (componentCallbacksC0077bw.f4618t && componentCallbacksC0077bw.f4619u && !componentCallbacksC0077bw.f4621w) {
            if (C0111cq.m5275S(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f33848c);
            }
            Bundle bundle = ((ComponentCallbacksC0077bw) this.f33848c).f4605g;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            ComponentCallbacksC0077bw componentCallbacksC0077bw2 = (ComponentCallbacksC0077bw) this.f33848c;
            componentCallbacksC0077bw2.mo2700cj(componentCallbacksC0077bw2.m3115j(bundle2), null, bundle2);
            View view = ((ComponentCallbacksC0077bw) this.f33848c).f4586N;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Object obj = this.f33848c;
                ((ComponentCallbacksC0077bw) obj).f4586N.setTag(C0100R.id.fragment_container_view_tag, obj);
                ComponentCallbacksC0077bw componentCallbacksC0077bw3 = (ComponentCallbacksC0077bw) this.f33848c;
                if (componentCallbacksC0077bw3.f4578F) {
                    componentCallbacksC0077bw3.f4586N.setVisibility(8);
                }
                ((ComponentCallbacksC0077bw) this.f33848c).m3120o();
                Object obj2 = this.f33847b;
                ComponentCallbacksC0077bw componentCallbacksC0077bw4 = (ComponentCallbacksC0077bw) this.f33848c;
                ((bck) obj2).m2203C(componentCallbacksC0077bw4, componentCallbacksC0077bw4.f4586N, bundle2, false);
                ((ComponentCallbacksC0077bw) this.f33848c).f4604f = 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:311:0x09bf A[Catch: all -> 0x0bf6, TryCatch #0 {all -> 0x0bf6, blocks: (B:9:0x001f, B:10:0x0022, B:12:0x0030, B:73:0x0150, B:81:0x016a, B:83:0x0170, B:84:0x017f, B:104:0x01ed, B:106:0x0220, B:108:0x0231, B:109:0x023b, B:110:0x0263, B:111:0x027c, B:90:0x018f, B:98:0x01a9, B:100:0x01b3, B:103:0x01cd, B:93:0x0196, B:95:0x019c, B:97:0x01a4, B:87:0x018a, B:112:0x027d, B:113:0x0285, B:115:0x028b, B:116:0x029a, B:118:0x02c5, B:120:0x02d6, B:121:0x02e0, B:122:0x02f7, B:123:0x0310, B:124:0x0311, B:126:0x0318, B:128:0x031f, B:130:0x033d, B:131:0x034c, B:132:0x0350, B:133:0x035b, B:135:0x0361, B:136:0x0370, B:138:0x0378, B:140:0x037e, B:142:0x03a0, B:144:0x03a6, B:145:0x03b4, B:147:0x03bb, B:149:0x03c2, B:151:0x03c8, B:153:0x03cf, B:154:0x03dd, B:156:0x03f0, B:158:0x03f7, B:159:0x0402, B:160:0x041b, B:161:0x041c, B:162:0x0439, B:163:0x0452, B:164:0x0453, B:165:0x045d, B:167:0x0463, B:168:0x0472, B:170:0x047a, B:172:0x0480, B:174:0x0489, B:176:0x04ca, B:177:0x04e3, B:178:0x04fc, B:179:0x04fd, B:180:0x050b, B:182:0x0511, B:183:0x0520, B:186:0x052e, B:188:0x053a, B:200:0x05af, B:201:0x05b2, B:203:0x05df, B:204:0x05eb, B:206:0x0629, B:207:0x0634, B:209:0x063a, B:210:0x0644, B:211:0x0664, B:212:0x067d, B:189:0x054f, B:190:0x0574, B:191:0x0575, B:193:0x057b, B:196:0x0586, B:197:0x05ab, B:213:0x067e, B:214:0x0680, B:216:0x0687, B:218:0x068d, B:219:0x069c, B:221:0x06ad, B:222:0x06b7, B:224:0x06d9, B:225:0x06e9, B:226:0x0702, B:227:0x0703, B:228:0x070c, B:230:0x0712, B:231:0x0721, B:233:0x0732, B:234:0x073c, B:236:0x075f, B:237:0x076f, B:238:0x0788, B:239:0x0789, B:241:0x078f, B:242:0x079e, B:244:0x07ac, B:246:0x07b2, B:247:0x07b5, B:249:0x07be, B:251:0x07c5, B:253:0x07d5, B:254:0x07e4, B:255:0x07e8, B:256:0x07f2, B:257:0x0800, B:259:0x0806, B:260:0x0815, B:262:0x081e, B:264:0x0824, B:265:0x0827, B:267:0x0838, B:269:0x084b, B:270:0x0855, B:272:0x086d, B:274:0x087c, B:275:0x088a, B:276:0x08c4, B:277:0x08dd, B:278:0x08de, B:280:0x08e8, B:281:0x08f7, B:283:0x0900, B:288:0x090d, B:290:0x0922, B:293:0x0933, B:295:0x093b, B:297:0x0945, B:299:0x0949, B:300:0x094f, B:301:0x095a, B:303:0x0964, B:306:0x0978, B:308:0x0981, B:309:0x098e, B:311:0x09bf, B:312:0x09d7, B:314:0x09dd, B:316:0x09e5, B:318:0x09f8, B:319:0x0a07, B:321:0x0a10, B:322:0x0a1c, B:323:0x0a27, B:324:0x0a40, B:304:0x096d, B:325:0x0a41, B:327:0x0a47, B:328:0x0a57, B:330:0x0a77, B:332:0x0a80, B:333:0x0a8c, B:335:0x0ab6, B:341:0x0ad3, B:343:0x0ad9, B:344:0x0ae6, B:338:0x0abf, B:345:0x0af1, B:346:0x0b0a, B:349:0x0b0f, B:351:0x0b16, B:353:0x0b1e, B:355:0x0b2a, B:356:0x0b39, B:358:0x0b53, B:359:0x0b60, B:360:0x0b67, B:362:0x0b70, B:364:0x0b77, B:366:0x0b7e, B:368:0x0b90, B:370:0x0b96, B:371:0x0ba5, B:372:0x0baa, B:374:0x0bb0, B:375:0x0bbf, B:376:0x0bc3, B:384:0x0bde, B:379:0x0bcd, B:381:0x0bd4, B:383:0x0bdc, B:13:0x0036, B:14:0x0044, B:15:0x0047, B:16:0x004c, B:17:0x0052, B:18:0x0058, B:19:0x005d, B:21:0x0066, B:23:0x006d, B:25:0x007b, B:27:0x0081, B:28:0x0086, B:30:0x008a, B:31:0x0093, B:32:0x0098, B:34:0x00a0, B:35:0x00a4, B:37:0x00ad, B:39:0x00c1, B:41:0x00c5, B:43:0x00d0, B:45:0x00e0, B:53:0x00f1, B:56:0x00f7, B:65:0x011e, B:67:0x0127, B:69:0x012e, B:70:0x0133, B:72:0x0139, B:58:0x00fe, B:59:0x0103, B:61:0x010c, B:63:0x0114, B:64:0x0119, B:48:0x00e5), top: B:391:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:314:0x09dd A[Catch: all -> 0x0bf6, TryCatch #0 {all -> 0x0bf6, blocks: (B:9:0x001f, B:10:0x0022, B:12:0x0030, B:73:0x0150, B:81:0x016a, B:83:0x0170, B:84:0x017f, B:104:0x01ed, B:106:0x0220, B:108:0x0231, B:109:0x023b, B:110:0x0263, B:111:0x027c, B:90:0x018f, B:98:0x01a9, B:100:0x01b3, B:103:0x01cd, B:93:0x0196, B:95:0x019c, B:97:0x01a4, B:87:0x018a, B:112:0x027d, B:113:0x0285, B:115:0x028b, B:116:0x029a, B:118:0x02c5, B:120:0x02d6, B:121:0x02e0, B:122:0x02f7, B:123:0x0310, B:124:0x0311, B:126:0x0318, B:128:0x031f, B:130:0x033d, B:131:0x034c, B:132:0x0350, B:133:0x035b, B:135:0x0361, B:136:0x0370, B:138:0x0378, B:140:0x037e, B:142:0x03a0, B:144:0x03a6, B:145:0x03b4, B:147:0x03bb, B:149:0x03c2, B:151:0x03c8, B:153:0x03cf, B:154:0x03dd, B:156:0x03f0, B:158:0x03f7, B:159:0x0402, B:160:0x041b, B:161:0x041c, B:162:0x0439, B:163:0x0452, B:164:0x0453, B:165:0x045d, B:167:0x0463, B:168:0x0472, B:170:0x047a, B:172:0x0480, B:174:0x0489, B:176:0x04ca, B:177:0x04e3, B:178:0x04fc, B:179:0x04fd, B:180:0x050b, B:182:0x0511, B:183:0x0520, B:186:0x052e, B:188:0x053a, B:200:0x05af, B:201:0x05b2, B:203:0x05df, B:204:0x05eb, B:206:0x0629, B:207:0x0634, B:209:0x063a, B:210:0x0644, B:211:0x0664, B:212:0x067d, B:189:0x054f, B:190:0x0574, B:191:0x0575, B:193:0x057b, B:196:0x0586, B:197:0x05ab, B:213:0x067e, B:214:0x0680, B:216:0x0687, B:218:0x068d, B:219:0x069c, B:221:0x06ad, B:222:0x06b7, B:224:0x06d9, B:225:0x06e9, B:226:0x0702, B:227:0x0703, B:228:0x070c, B:230:0x0712, B:231:0x0721, B:233:0x0732, B:234:0x073c, B:236:0x075f, B:237:0x076f, B:238:0x0788, B:239:0x0789, B:241:0x078f, B:242:0x079e, B:244:0x07ac, B:246:0x07b2, B:247:0x07b5, B:249:0x07be, B:251:0x07c5, B:253:0x07d5, B:254:0x07e4, B:255:0x07e8, B:256:0x07f2, B:257:0x0800, B:259:0x0806, B:260:0x0815, B:262:0x081e, B:264:0x0824, B:265:0x0827, B:267:0x0838, B:269:0x084b, B:270:0x0855, B:272:0x086d, B:274:0x087c, B:275:0x088a, B:276:0x08c4, B:277:0x08dd, B:278:0x08de, B:280:0x08e8, B:281:0x08f7, B:283:0x0900, B:288:0x090d, B:290:0x0922, B:293:0x0933, B:295:0x093b, B:297:0x0945, B:299:0x0949, B:300:0x094f, B:301:0x095a, B:303:0x0964, B:306:0x0978, B:308:0x0981, B:309:0x098e, B:311:0x09bf, B:312:0x09d7, B:314:0x09dd, B:316:0x09e5, B:318:0x09f8, B:319:0x0a07, B:321:0x0a10, B:322:0x0a1c, B:323:0x0a27, B:324:0x0a40, B:304:0x096d, B:325:0x0a41, B:327:0x0a47, B:328:0x0a57, B:330:0x0a77, B:332:0x0a80, B:333:0x0a8c, B:335:0x0ab6, B:341:0x0ad3, B:343:0x0ad9, B:344:0x0ae6, B:338:0x0abf, B:345:0x0af1, B:346:0x0b0a, B:349:0x0b0f, B:351:0x0b16, B:353:0x0b1e, B:355:0x0b2a, B:356:0x0b39, B:358:0x0b53, B:359:0x0b60, B:360:0x0b67, B:362:0x0b70, B:364:0x0b77, B:366:0x0b7e, B:368:0x0b90, B:370:0x0b96, B:371:0x0ba5, B:372:0x0baa, B:374:0x0bb0, B:375:0x0bbf, B:376:0x0bc3, B:384:0x0bde, B:379:0x0bcd, B:381:0x0bd4, B:383:0x0bdc, B:13:0x0036, B:14:0x0044, B:15:0x0047, B:16:0x004c, B:17:0x0052, B:18:0x0058, B:19:0x005d, B:21:0x0066, B:23:0x006d, B:25:0x007b, B:27:0x0081, B:28:0x0086, B:30:0x008a, B:31:0x0093, B:32:0x0098, B:34:0x00a0, B:35:0x00a4, B:37:0x00ad, B:39:0x00c1, B:41:0x00c5, B:43:0x00d0, B:45:0x00e0, B:53:0x00f1, B:56:0x00f7, B:65:0x011e, B:67:0x0127, B:69:0x012e, B:70:0x0133, B:72:0x0139, B:58:0x00fe, B:59:0x0103, B:61:0x010c, B:63:0x0114, B:64:0x0119, B:48:0x00e5), top: B:391:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:321:0x0a10 A[Catch: all -> 0x0bf6, TryCatch #0 {all -> 0x0bf6, blocks: (B:9:0x001f, B:10:0x0022, B:12:0x0030, B:73:0x0150, B:81:0x016a, B:83:0x0170, B:84:0x017f, B:104:0x01ed, B:106:0x0220, B:108:0x0231, B:109:0x023b, B:110:0x0263, B:111:0x027c, B:90:0x018f, B:98:0x01a9, B:100:0x01b3, B:103:0x01cd, B:93:0x0196, B:95:0x019c, B:97:0x01a4, B:87:0x018a, B:112:0x027d, B:113:0x0285, B:115:0x028b, B:116:0x029a, B:118:0x02c5, B:120:0x02d6, B:121:0x02e0, B:122:0x02f7, B:123:0x0310, B:124:0x0311, B:126:0x0318, B:128:0x031f, B:130:0x033d, B:131:0x034c, B:132:0x0350, B:133:0x035b, B:135:0x0361, B:136:0x0370, B:138:0x0378, B:140:0x037e, B:142:0x03a0, B:144:0x03a6, B:145:0x03b4, B:147:0x03bb, B:149:0x03c2, B:151:0x03c8, B:153:0x03cf, B:154:0x03dd, B:156:0x03f0, B:158:0x03f7, B:159:0x0402, B:160:0x041b, B:161:0x041c, B:162:0x0439, B:163:0x0452, B:164:0x0453, B:165:0x045d, B:167:0x0463, B:168:0x0472, B:170:0x047a, B:172:0x0480, B:174:0x0489, B:176:0x04ca, B:177:0x04e3, B:178:0x04fc, B:179:0x04fd, B:180:0x050b, B:182:0x0511, B:183:0x0520, B:186:0x052e, B:188:0x053a, B:200:0x05af, B:201:0x05b2, B:203:0x05df, B:204:0x05eb, B:206:0x0629, B:207:0x0634, B:209:0x063a, B:210:0x0644, B:211:0x0664, B:212:0x067d, B:189:0x054f, B:190:0x0574, B:191:0x0575, B:193:0x057b, B:196:0x0586, B:197:0x05ab, B:213:0x067e, B:214:0x0680, B:216:0x0687, B:218:0x068d, B:219:0x069c, B:221:0x06ad, B:222:0x06b7, B:224:0x06d9, B:225:0x06e9, B:226:0x0702, B:227:0x0703, B:228:0x070c, B:230:0x0712, B:231:0x0721, B:233:0x0732, B:234:0x073c, B:236:0x075f, B:237:0x076f, B:238:0x0788, B:239:0x0789, B:241:0x078f, B:242:0x079e, B:244:0x07ac, B:246:0x07b2, B:247:0x07b5, B:249:0x07be, B:251:0x07c5, B:253:0x07d5, B:254:0x07e4, B:255:0x07e8, B:256:0x07f2, B:257:0x0800, B:259:0x0806, B:260:0x0815, B:262:0x081e, B:264:0x0824, B:265:0x0827, B:267:0x0838, B:269:0x084b, B:270:0x0855, B:272:0x086d, B:274:0x087c, B:275:0x088a, B:276:0x08c4, B:277:0x08dd, B:278:0x08de, B:280:0x08e8, B:281:0x08f7, B:283:0x0900, B:288:0x090d, B:290:0x0922, B:293:0x0933, B:295:0x093b, B:297:0x0945, B:299:0x0949, B:300:0x094f, B:301:0x095a, B:303:0x0964, B:306:0x0978, B:308:0x0981, B:309:0x098e, B:311:0x09bf, B:312:0x09d7, B:314:0x09dd, B:316:0x09e5, B:318:0x09f8, B:319:0x0a07, B:321:0x0a10, B:322:0x0a1c, B:323:0x0a27, B:324:0x0a40, B:304:0x096d, B:325:0x0a41, B:327:0x0a47, B:328:0x0a57, B:330:0x0a77, B:332:0x0a80, B:333:0x0a8c, B:335:0x0ab6, B:341:0x0ad3, B:343:0x0ad9, B:344:0x0ae6, B:338:0x0abf, B:345:0x0af1, B:346:0x0b0a, B:349:0x0b0f, B:351:0x0b16, B:353:0x0b1e, B:355:0x0b2a, B:356:0x0b39, B:358:0x0b53, B:359:0x0b60, B:360:0x0b67, B:362:0x0b70, B:364:0x0b77, B:366:0x0b7e, B:368:0x0b90, B:370:0x0b96, B:371:0x0ba5, B:372:0x0baa, B:374:0x0bb0, B:375:0x0bbf, B:376:0x0bc3, B:384:0x0bde, B:379:0x0bcd, B:381:0x0bd4, B:383:0x0bdc, B:13:0x0036, B:14:0x0044, B:15:0x0047, B:16:0x004c, B:17:0x0052, B:18:0x0058, B:19:0x005d, B:21:0x0066, B:23:0x006d, B:25:0x007b, B:27:0x0081, B:28:0x0086, B:30:0x008a, B:31:0x0093, B:32:0x0098, B:34:0x00a0, B:35:0x00a4, B:37:0x00ad, B:39:0x00c1, B:41:0x00c5, B:43:0x00d0, B:45:0x00e0, B:53:0x00f1, B:56:0x00f7, B:65:0x011e, B:67:0x0127, B:69:0x012e, B:70:0x0133, B:72:0x0139, B:58:0x00fe, B:59:0x0103, B:61:0x010c, B:63:0x0114, B:64:0x0119, B:48:0x00e5), top: B:391:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:429:0x0a27 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x09e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x09f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:461:0x09d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x09d7 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v201, types: [akv, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    public final void m13002e() {
        int iMin;
        int i;
        C0133dl c0133dl;
        ViewGroup viewGroup;
        jew jewVarM5555k;
        ViewGroup viewGroup2;
        Object obj;
        Object obj2;
        String str;
        Object obj3;
        ComponentCallbacksC0077bw componentCallbacksC0077bwM5546b;
        View view;
        ViewGroup viewGroup3;
        if (this.f33850e) {
            if (C0111cq.m5275S(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring re-entrant call to moveToExpectedState() for ");
                sb.append(this.f33848c);
                return;
            }
            return;
        }
        int i2 = 0;
        try {
            this.f33850e = true;
            boolean z = false;
            while (true) {
                Object obj4 = this.f33848c;
                if (((ComponentCallbacksC0077bw) obj4).f4623y == null) {
                    iMin = ((ComponentCallbacksC0077bw) obj4).f4604f;
                } else {
                    iMin = this.f33846a;
                    akr akrVar = akr.DESTROYED;
                    switch (((ComponentCallbacksC0077bw) this.f33848c).f4594V.ordinal()) {
                        case 1:
                            iMin = Math.min(iMin, i2);
                            break;
                        case 2:
                            iMin = Math.min(iMin, 1);
                            break;
                        case 3:
                            iMin = Math.min(iMin, 5);
                            break;
                        case 4:
                            break;
                        default:
                            iMin = Math.min(iMin, -1);
                            break;
                    }
                    Object obj5 = this.f33848c;
                    if (((ComponentCallbacksC0077bw) obj5).f4618t) {
                        if (((ComponentCallbacksC0077bw) obj5).f4619u) {
                            iMin = Math.max(this.f33846a, 2);
                            View view2 = ((ComponentCallbacksC0077bw) this.f33848c).f4586N;
                            if (view2 != null && view2.getParent() == null) {
                                iMin = Math.min(iMin, 2);
                            }
                        } else {
                            iMin = this.f33846a < 4 ? Math.min(iMin, ((ComponentCallbacksC0077bw) obj5).f4604f) : Math.min(iMin, 1);
                        }
                    }
                    if (!((ComponentCallbacksC0077bw) this.f33848c).f4615q) {
                        iMin = Math.min(iMin, 1);
                    }
                    Object obj6 = this.f33848c;
                    ViewGroup viewGroup4 = ((ComponentCallbacksC0077bw) obj6).f4585M;
                    if (viewGroup4 != null) {
                        C0134dm c0134dmM6385b = C0134dm.m6385b(viewGroup4, ((ComponentCallbacksC0077bw) obj6).getParentFragmentManager());
                        C0133dl c0133dlM6390a = c0134dmM6385b.m6390a((ComponentCallbacksC0077bw) this.f33848c);
                        i = c0133dlM6390a != null ? c0133dlM6390a.f11920f : 0;
                        Object obj7 = this.f33848c;
                        ArrayList arrayList = c0134dmM6385b.f12010c;
                        int size = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                c0133dl = (C0133dl) arrayList.get(i3);
                                if (!c0133dl.f11915a.equals(obj7) || c0133dl.f11917c) {
                                    i3++;
                                }
                            } else {
                                c0133dl = null;
                            }
                        }
                        if (c0133dl != null && (i == 0 || i == 1)) {
                            i = c0133dl.f11920f;
                        }
                    } else {
                        i = 0;
                    }
                    if (i == 2) {
                        iMin = Math.min(iMin, 6);
                    } else if (i == 3) {
                        iMin = Math.max(iMin, 3);
                    } else {
                        Object obj8 = this.f33848c;
                        if (((ComponentCallbacksC0077bw) obj8).f4616r) {
                            iMin = ((ComponentCallbacksC0077bw) obj8).m3128w() ? Math.min(iMin, 1) : Math.min(iMin, -1);
                        }
                    }
                    Object obj9 = this.f33848c;
                    if (((ComponentCallbacksC0077bw) obj9).f4587O && ((ComponentCallbacksC0077bw) obj9).f4604f < 5) {
                        iMin = Math.min(iMin, 4);
                    }
                    if (C0111cq.m5275S(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("computeExpectedState() of ");
                        sb2.append(iMin);
                        sb2.append(" for ");
                        sb2.append(this.f33848c);
                    }
                }
                Object obj10 = this.f33848c;
                int i4 = ((ComponentCallbacksC0077bw) obj10).f4604f;
                if (iMin == i4) {
                    if (!z && i4 == -1 && ((ComponentCallbacksC0077bw) obj10).f4616r && !((ComponentCallbacksC0077bw) obj10).m3128w()) {
                        boolean z2 = ((ComponentCallbacksC0077bw) this.f33848c).f4617s;
                        if (C0111cq.m5275S(3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Cleaning up state of never attached fragment: ");
                            sb3.append(this.f33848c);
                        }
                        ((C0116cv) this.f33849d).f9746d.m5447b((ComponentCallbacksC0077bw) this.f33848c);
                        ((C0116cv) this.f33849d).m5557m(this);
                        if (C0111cq.m5275S(3)) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("initState called for fragment: ");
                            sb4.append(this.f33848c);
                        }
                        ((ComponentCallbacksC0077bw) this.f33848c).m3119n();
                    }
                    Object obj11 = this.f33848c;
                    if (((ComponentCallbacksC0077bw) obj11).f4591S) {
                        if (((ComponentCallbacksC0077bw) obj11).f4586N != null && (viewGroup = ((ComponentCallbacksC0077bw) obj11).f4585M) != null) {
                            C0134dm c0134dmM6385b2 = C0134dm.m6385b(viewGroup, ((ComponentCallbacksC0077bw) obj11).getParentFragmentManager());
                            if (((ComponentCallbacksC0077bw) this.f33848c).f4578F) {
                                if (C0111cq.m5275S(2)) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
                                    sb5.append(this.f33848c);
                                }
                                c0134dmM6385b2.m6396k(3, 1, this);
                            } else {
                                if (C0111cq.m5275S(2)) {
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append("SpecialEffectsController: Enqueuing show operation for fragment ");
                                    sb6.append(this.f33848c);
                                }
                                c0134dmM6385b2.m6396k(2, 1, this);
                            }
                        }
                        Object obj12 = this.f33848c;
                        C0111cq c0111cq = ((ComponentCallbacksC0077bw) obj12).f4623y;
                        if (c0111cq != null && ((ComponentCallbacksC0077bw) obj12).f4615q && C0111cq.m5276X((ComponentCallbacksC0077bw) obj12)) {
                            c0111cq.f8797q = true;
                        }
                        Object obj13 = this.f33848c;
                        ((ComponentCallbacksC0077bw) obj13).f4591S = false;
                        boolean z3 = ((ComponentCallbacksC0077bw) obj13).f4578F;
                        ((ComponentCallbacksC0077bw) obj13).f4573A.m5338t();
                    }
                    this.f33850e = false;
                    return;
                }
                if (iMin <= i4) {
                    switch (i4 - 1) {
                        case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                            if (C0111cq.m5275S(3)) {
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(IuyLAqNmW.wEPgMSnQRbFLb);
                                sb7.append(this.f33848c);
                            }
                            Object obj14 = this.f33848c;
                            ((ComponentCallbacksC0077bw) obj14).f4604f = -1;
                            ((ComponentCallbacksC0077bw) obj14).f4584L = false;
                            ((ComponentCallbacksC0077bw) obj14).onDetach();
                            ((ComponentCallbacksC0077bw) obj14).f4592T = null;
                            if (!((ComponentCallbacksC0077bw) obj14).f4584L) {
                                throw new C0135dn("Fragment " + obj14 + " did not call through to super.onDetach()");
                            }
                            C0111cq c0111cq2 = ((ComponentCallbacksC0077bw) obj14).f4573A;
                            if (!c0111cq2.f8800t) {
                                c0111cq2.m5335q();
                                ((ComponentCallbacksC0077bw) obj14).f4573A = new C0111cq();
                            }
                            ((bck) this.f33847b).m2221u((ComponentCallbacksC0077bw) this.f33848c, false);
                            Object obj15 = this.f33848c;
                            ((ComponentCallbacksC0077bw) obj15).f4604f = -1;
                            ((ComponentCallbacksC0077bw) obj15).f4624z = null;
                            ((ComponentCallbacksC0077bw) obj15).f4574B = null;
                            ((ComponentCallbacksC0077bw) obj15).f4623y = null;
                            if ((!((ComponentCallbacksC0077bw) obj15).f4616r || ((ComponentCallbacksC0077bw) obj15).m3128w()) && !((C0116cv) this.f33849d).f9746d.m5450f((ComponentCallbacksC0077bw) this.f33848c)) {
                                i2 = 0;
                                z = true;
                            } else {
                                if (C0111cq.m5275S(3)) {
                                    StringBuilder sb8 = new StringBuilder();
                                    sb8.append("initState called for fragment: ");
                                    sb8.append(this.f33848c);
                                }
                                ((ComponentCallbacksC0077bw) this.f33848c).m3119n();
                                i2 = 0;
                                z = true;
                            }
                            break;
                            break;
                        case 0:
                            boolean z4 = ((ComponentCallbacksC0077bw) obj10).f4617s;
                            if (C0111cq.m5275S(3)) {
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append("movefrom CREATED: ");
                                sb9.append(this.f33848c);
                            }
                            Object obj16 = this.f33848c;
                            boolean z5 = ((ComponentCallbacksC0077bw) obj16).f4616r && !((ComponentCallbacksC0077bw) obj16).m3128w();
                            if (z5) {
                                Object obj17 = this.f33848c;
                                boolean z6 = ((ComponentCallbacksC0077bw) obj17).f4617s;
                                ((C0116cv) this.f33849d).m5545a(((ComponentCallbacksC0077bw) obj17).f4609k, null);
                            }
                            if (z5 || ((C0116cv) this.f33849d).f9746d.m5450f((ComponentCallbacksC0077bw) this.f33848c)) {
                                C0086ce c0086ce = ((ComponentCallbacksC0077bw) this.f33848c).f4624z;
                                boolean z7 = c0086ce instanceof alw ? ((C0116cv) this.f33849d).f9746d.f9210f : !((Activity) c0086ce.f5399c).isChangingConfigurations();
                                if (!z5) {
                                    if (z7) {
                                    }
                                    obj = this.f33848c;
                                    ((ComponentCallbacksC0077bw) obj).f4573A.m5335q();
                                    ((ComponentCallbacksC0077bw) obj).f4601ab.m880b(akq.ON_DESTROY);
                                    ((ComponentCallbacksC0077bw) obj).f4604f = 0;
                                    ((ComponentCallbacksC0077bw) obj).f4584L = false;
                                    ((ComponentCallbacksC0077bw) obj).f4593U = false;
                                    ((ComponentCallbacksC0077bw) obj).onDestroy();
                                    if (((ComponentCallbacksC0077bw) obj).f4584L) {
                                        throw new C0135dn("Fragment " + obj + " did not call through to super.onDestroy()");
                                    }
                                    ((bck) this.f33847b).m2220t((ComponentCallbacksC0077bw) this.f33848c, false);
                                    for (jew jewVar : ((C0116cv) this.f33849d).m5548d()) {
                                        if (jewVar != null) {
                                            obj3 = jewVar.f33848c;
                                            if (((ComponentCallbacksC0077bw) this.f33848c).f4609k.equals(((ComponentCallbacksC0077bw) obj3).f4612n)) {
                                                ((ComponentCallbacksC0077bw) obj3).f4611m = (ComponentCallbacksC0077bw) this.f33848c;
                                                ((ComponentCallbacksC0077bw) obj3).f4612n = null;
                                            }
                                        }
                                    }
                                    obj2 = this.f33848c;
                                    str = ((ComponentCallbacksC0077bw) obj2).f4612n;
                                    if (str != null) {
                                        ((ComponentCallbacksC0077bw) obj2).f4611m = ((C0116cv) this.f33849d).m5546b(str);
                                    }
                                    ((C0116cv) this.f33849d).m5557m(this);
                                    i2 = 0;
                                    z = true;
                                } else {
                                    boolean z8 = ((ComponentCallbacksC0077bw) this.f33848c).f4617s;
                                }
                                ((C0116cv) this.f33849d).f9746d.m5447b((ComponentCallbacksC0077bw) this.f33848c);
                                obj = this.f33848c;
                                ((ComponentCallbacksC0077bw) obj).f4573A.m5335q();
                                ((ComponentCallbacksC0077bw) obj).f4601ab.m880b(akq.ON_DESTROY);
                                ((ComponentCallbacksC0077bw) obj).f4604f = 0;
                                ((ComponentCallbacksC0077bw) obj).f4584L = false;
                                ((ComponentCallbacksC0077bw) obj).f4593U = false;
                                ((ComponentCallbacksC0077bw) obj).onDestroy();
                                if (((ComponentCallbacksC0077bw) obj).f4584L) {
                                    throw new C0135dn("Fragment " + obj + " did not call through to super.onDestroy()");
                                }
                                ((bck) this.f33847b).m2220t((ComponentCallbacksC0077bw) this.f33848c, false);
                                while (r2.hasNext()) {
                                    if (jewVar != null) {
                                        obj3 = jewVar.f33848c;
                                        if (((ComponentCallbacksC0077bw) this.f33848c).f4609k.equals(((ComponentCallbacksC0077bw) obj3).f4612n)) {
                                            ((ComponentCallbacksC0077bw) obj3).f4611m = (ComponentCallbacksC0077bw) this.f33848c;
                                            ((ComponentCallbacksC0077bw) obj3).f4612n = null;
                                        }
                                    }
                                }
                                obj2 = this.f33848c;
                                str = ((ComponentCallbacksC0077bw) obj2).f4612n;
                                if (str != null) {
                                    ((ComponentCallbacksC0077bw) obj2).f4611m = ((C0116cv) this.f33849d).m5546b(str);
                                }
                                ((C0116cv) this.f33849d).m5557m(this);
                                i2 = 0;
                                z = true;
                            } else {
                                String str2 = ((ComponentCallbacksC0077bw) this.f33848c).f4612n;
                                if (str2 != null && (componentCallbacksC0077bwM5546b = ((C0116cv) this.f33849d).m5546b(str2)) != null && componentCallbacksC0077bwM5546b.f4580H) {
                                    ((ComponentCallbacksC0077bw) this.f33848c).f4611m = componentCallbacksC0077bwM5546b;
                                }
                                ((ComponentCallbacksC0077bw) this.f33848c).f4604f = 0;
                                i2 = 0;
                                z = true;
                            }
                            break;
                        case 1:
                            if (C0111cq.m5275S(3)) {
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append("movefrom CREATE_VIEW: ");
                                sb10.append(this.f33848c);
                            }
                            Object obj18 = this.f33848c;
                            ViewGroup viewGroup5 = ((ComponentCallbacksC0077bw) obj18).f4585M;
                            if (viewGroup5 != null && (view = ((ComponentCallbacksC0077bw) obj18).f4586N) != null) {
                                viewGroup5.removeView(view);
                            }
                            ?? r2 = this.f33848c;
                            ((ComponentCallbacksC0077bw) r2).f4573A.m5293A(1);
                            if (((ComponentCallbacksC0077bw) r2).f4586N != null && ((ComponentCallbacksC0077bw) r2).f4595W.getLifecycle().f598a.m872a(akr.CREATED)) {
                                ((ComponentCallbacksC0077bw) r2).f4595W.m6086a(akq.ON_DESTROY);
                            }
                            ((ComponentCallbacksC0077bw) r2).f4604f = 1;
                            ((ComponentCallbacksC0077bw) r2).f4584L = false;
                            ((ComponentCallbacksC0077bw) r2).onDestroyView();
                            if (!((ComponentCallbacksC0077bw) r2).f4584L) {
                                throw new C0135dn("Fragment " + ((Object) r2) + " did not call through to super.onDestroyView()");
                            }
                            amh amhVar = amd.m936a(r2).f681a;
                            int iM19563b = amhVar.f692b.m19563b();
                            for (int i5 = 0; i5 < iM19563b; i5++) {
                                ((ame) amhVar.f692b.m19564c(i5)).m940i();
                            }
                            ((ComponentCallbacksC0077bw) r2).f4621w = false;
                            ((bck) this.f33847b).m2204D((ComponentCallbacksC0077bw) this.f33848c, false);
                            Object obj19 = this.f33848c;
                            ((ComponentCallbacksC0077bw) obj19).f4585M = null;
                            ((ComponentCallbacksC0077bw) obj19).f4586N = null;
                            ((ComponentCallbacksC0077bw) obj19).f4595W = null;
                            ((ComponentCallbacksC0077bw) obj19).f4596X.mo904g(null);
                            Object obj20 = this.f33848c;
                            ((ComponentCallbacksC0077bw) obj20).f4619u = false;
                            ((ComponentCallbacksC0077bw) obj20).f4604f = 1;
                            i2 = 0;
                            z = true;
                            break;
                            break;
                        case 2:
                            ((ComponentCallbacksC0077bw) obj10).f4619u = false;
                            ((ComponentCallbacksC0077bw) obj10).f4604f = 2;
                            i2 = 0;
                            z = true;
                            break;
                        case 3:
                            if (C0111cq.m5275S(3)) {
                                StringBuilder sb11 = new StringBuilder();
                                sb11.append("movefrom ACTIVITY_CREATED: ");
                                sb11.append(this.f33848c);
                            }
                            Object obj21 = this.f33848c;
                            boolean z9 = ((ComponentCallbacksC0077bw) obj21).f4617s;
                            if (((ComponentCallbacksC0077bw) obj21).f4586N != null && ((ComponentCallbacksC0077bw) obj21).f4606h == null) {
                                m13004g();
                            }
                            Object obj22 = this.f33848c;
                            if (((ComponentCallbacksC0077bw) obj22).f4586N != null && (viewGroup3 = ((ComponentCallbacksC0077bw) obj22).f4585M) != null) {
                                C0134dm c0134dmM6385b3 = C0134dm.m6385b(viewGroup3, ((ComponentCallbacksC0077bw) obj22).getParentFragmentManager());
                                if (C0111cq.m5275S(2)) {
                                    StringBuilder sb12 = new StringBuilder();
                                    sb12.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
                                    sb12.append(this.f33848c);
                                }
                                c0134dmM6385b3.m6396k(1, 3, this);
                            }
                            ((ComponentCallbacksC0077bw) this.f33848c).f4604f = 3;
                            i2 = 0;
                            z = true;
                            break;
                        case 4:
                            if (C0111cq.m5275S(3)) {
                                StringBuilder sb13 = new StringBuilder();
                                sb13.append("movefrom STARTED: ");
                                sb13.append(this.f33848c);
                            }
                            Object obj23 = this.f33848c;
                            ((ComponentCallbacksC0077bw) obj23).f4573A.m5294B();
                            if (((ComponentCallbacksC0077bw) obj23).f4586N != null) {
                                ((ComponentCallbacksC0077bw) obj23).f4595W.m6086a(akq.ON_STOP);
                            }
                            ((ComponentCallbacksC0077bw) obj23).f4601ab.m880b(akq.ON_STOP);
                            ((ComponentCallbacksC0077bw) obj23).f4604f = 4;
                            ((ComponentCallbacksC0077bw) obj23).f4584L = false;
                            ((ComponentCallbacksC0077bw) obj23).onStop();
                            if (!((ComponentCallbacksC0077bw) obj23).f4584L) {
                                throw new C0135dn("Fragment " + obj23 + " did not call through to super.onStop()");
                            }
                            ((bck) this.f33847b).m2202B((ComponentCallbacksC0077bw) this.f33848c, false);
                            i2 = 0;
                            z = true;
                            break;
                            break;
                        case 5:
                            ((ComponentCallbacksC0077bw) obj10).f4604f = 5;
                            i2 = 0;
                            z = true;
                            break;
                        case 6:
                            if (C0111cq.m5275S(3)) {
                                StringBuilder sb14 = new StringBuilder();
                                sb14.append("movefrom RESUMED: ");
                                sb14.append(this.f33848c);
                            }
                            Object obj24 = this.f33848c;
                            ((ComponentCallbacksC0077bw) obj24).f4573A.m5341w();
                            if (((ComponentCallbacksC0077bw) obj24).f4586N != null) {
                                ((ComponentCallbacksC0077bw) obj24).f4595W.m6086a(akq.ON_PAUSE);
                            }
                            ((ComponentCallbacksC0077bw) obj24).f4601ab.m880b(akq.ON_PAUSE);
                            ((ComponentCallbacksC0077bw) obj24).f4604f = 6;
                            ((ComponentCallbacksC0077bw) obj24).f4584L = false;
                            ((ComponentCallbacksC0077bw) obj24).onPause();
                            if (!((ComponentCallbacksC0077bw) obj24).f4584L) {
                                throw new C0135dn("Fragment " + obj24 + " did not call through to super.onPause()");
                            }
                            ((bck) this.f33847b).m2222v((ComponentCallbacksC0077bw) this.f33848c, false);
                            i2 = 0;
                            z = true;
                            break;
                            break;
                        default:
                            i2 = 0;
                            z = true;
                            break;
                    }
                } else {
                    switch (i4 + 1) {
                        case 0:
                            if (C0111cq.m5275S(3)) {
                                StringBuilder sb15 = new StringBuilder();
                                sb15.append("moveto ATTACHED: ");
                                sb15.append(this.f33848c);
                            }
                            Object obj25 = this.f33848c;
                            ComponentCallbacksC0077bw componentCallbacksC0077bw = ((ComponentCallbacksC0077bw) obj25).f4611m;
                            String str3 = JrxsYuVZZqnFC.rBQBmYoxnLJf;
                            if (componentCallbacksC0077bw != null) {
                                jew jewVarM5555k2 = ((C0116cv) this.f33849d).m5555k(componentCallbacksC0077bw.f4609k);
                                if (jewVarM5555k2 == null) {
                                    throw new IllegalStateException("Fragment " + this.f33848c + str3 + ((ComponentCallbacksC0077bw) this.f33848c).f4611m + " that does not belong to this FragmentManager!");
                                }
                                Object obj26 = this.f33848c;
                                ((ComponentCallbacksC0077bw) obj26).f4612n = ((ComponentCallbacksC0077bw) obj26).f4611m.f4609k;
                                ((ComponentCallbacksC0077bw) obj26).f4611m = null;
                                jewVarM5555k = jewVarM5555k2;
                            } else {
                                String str4 = ((ComponentCallbacksC0077bw) obj25).f4612n;
                                if (str4 != null) {
                                    jewVarM5555k = ((C0116cv) this.f33849d).m5555k(str4);
                                    if (jewVarM5555k == null) {
                                        throw new IllegalStateException("Fragment " + this.f33848c + str3 + ((ComponentCallbacksC0077bw) this.f33848c).f4612n + " that does not belong to this FragmentManager!");
                                    }
                                } else {
                                    jewVarM5555k = null;
                                }
                            }
                            if (jewVarM5555k != null) {
                                jewVarM5555k.m13002e();
                            }
                            Object obj27 = this.f33848c;
                            C0111cq c0111cq3 = ((ComponentCallbacksC0077bw) obj27).f4623y;
                            ((ComponentCallbacksC0077bw) obj27).f4624z = c0111cq3.f8789i;
                            ((ComponentCallbacksC0077bw) obj27).f4574B = c0111cq3.f8791k;
                            ((bck) this.f33847b).m2223w((ComponentCallbacksC0077bw) obj27, false);
                            Object obj28 = this.f33848c;
                            ArrayList arrayList2 = ((ComponentCallbacksC0077bw) obj28).f4600aa;
                            int size2 = arrayList2.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                ((AbstractC0075bu) arrayList2.get(i6)).mo2783a();
                            }
                            ((ComponentCallbacksC0077bw) obj28).f4600aa.clear();
                            ((ComponentCallbacksC0077bw) obj28).f4573A.m5329k(((ComponentCallbacksC0077bw) obj28).f4624z, ((ComponentCallbacksC0077bw) obj28).mo2698aT(), (ComponentCallbacksC0077bw) obj28);
                            ((ComponentCallbacksC0077bw) obj28).f4604f = 0;
                            ((ComponentCallbacksC0077bw) obj28).f4584L = false;
                            ((ComponentCallbacksC0077bw) obj28).onAttach(((ComponentCallbacksC0077bw) obj28).f4624z.f5399c);
                            if (!((ComponentCallbacksC0077bw) obj28).f4584L) {
                                throw new C0135dn("Fragment " + obj28 + " did not call through to super.onAttach()");
                            }
                            Iterator it = ((ComponentCallbacksC0077bw) obj28).f4623y.f8787g.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC0114ct) it.next()).mo3179g();
                            }
                            C0111cq c0111cq4 = ((ComponentCallbacksC0077bw) obj28).f4573A;
                            c0111cq4.f8798r = false;
                            c0111cq4.f8799s = false;
                            c0111cq4.f8801u.f9211g = false;
                            c0111cq4.m5293A(0);
                            ((bck) this.f33847b).m2218r((ComponentCallbacksC0077bw) this.f33848c, false);
                            i2 = 0;
                            z = true;
                            break;
                            break;
                        case 1:
                            if (C0111cq.m5275S(3)) {
                                StringBuilder sb16 = new StringBuilder();
                                sb16.append("moveto CREATED: ");
                                sb16.append(this.f33848c);
                            }
                            Bundle bundle = ((ComponentCallbacksC0077bw) this.f33848c).f4605g;
                            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
                            Object obj29 = this.f33848c;
                            if (!((ComponentCallbacksC0077bw) obj29).f4593U) {
                                ((bck) this.f33847b).m2224x((ComponentCallbacksC0077bw) obj29, bundle2, false);
                                Object obj30 = this.f33848c;
                                ((ComponentCallbacksC0077bw) obj30).f4573A.m5300H();
                                ((ComponentCallbacksC0077bw) obj30).f4604f = 1;
                                ((ComponentCallbacksC0077bw) obj30).f4584L = false;
                                final ComponentCallbacksC0077bw componentCallbacksC0077bw2 = (ComponentCallbacksC0077bw) obj30;
                                ((ComponentCallbacksC0077bw) obj30).f4601ab.m879a(new akt() { // from class: android.support.v4.app.Fragment$6
                                    @Override // p000.akt
                                    /* JADX INFO: renamed from: a */
                                    public final void mo883a(akv akvVar, akq akqVar) {
                                        View view3;
                                        if (akqVar != akq.ON_STOP || (view3 = componentCallbacksC0077bw2.f4586N) == null) {
                                            return;
                                        }
                                        view3.cancelPendingInputEvents();
                                    }
                                });
                                ((ComponentCallbacksC0077bw) obj30).onCreate(bundle2);
                                ((ComponentCallbacksC0077bw) obj30).f4593U = true;
                                if (!((ComponentCallbacksC0077bw) obj30).f4584L) {
                                    throw new C0135dn("Fragment " + obj30 + " did not call through to super.onCreate()");
                                }
                                ((ComponentCallbacksC0077bw) obj30).f4601ab.m880b(akq.ON_CREATE);
                                ((bck) this.f33847b).m2219s((ComponentCallbacksC0077bw) this.f33848c, bundle2, false);
                                i2 = 0;
                                z = true;
                            } else {
                                ((ComponentCallbacksC0077bw) obj29).f4604f = 1;
                                ((ComponentCallbacksC0077bw) obj29).m3121p();
                                i2 = 0;
                                z = true;
                            }
                            break;
                        case 2:
                            m13001d();
                            m13000c();
                            i2 = 0;
                            z = true;
                            break;
                        case 3:
                            if (C0111cq.m5275S(3)) {
                                StringBuilder sb17 = new StringBuilder();
                                sb17.append("moveto ACTIVITY_CREATED: ");
                                sb17.append(this.f33848c);
                            }
                            Bundle bundle3 = ((ComponentCallbacksC0077bw) this.f33848c).f4605g;
                            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
                            Object obj31 = this.f33848c;
                            ((ComponentCallbacksC0077bw) obj31).f4573A.m5300H();
                            ((ComponentCallbacksC0077bw) obj31).f4604f = 3;
                            ((ComponentCallbacksC0077bw) obj31).f4584L = false;
                            ((ComponentCallbacksC0077bw) obj31).onActivityCreated(bundle4);
                            if (!((ComponentCallbacksC0077bw) obj31).f4584L) {
                                throw new C0135dn("Fragment " + obj31 + " did not call through to super.onActivityCreated()");
                            }
                            if (C0111cq.m5275S(3)) {
                                StringBuilder sb18 = new StringBuilder();
                                sb18.append(WIxTIdUIdfb.USSuZuGpiQapS);
                                sb18.append(obj31);
                            }
                            if (((ComponentCallbacksC0077bw) obj31).f4586N != null) {
                                Bundle bundle5 = ((ComponentCallbacksC0077bw) obj31).f4605g;
                                Bundle bundle6 = bundle5 != null ? bundle5.getBundle("savedInstanceState") : null;
                                SparseArray<Parcelable> sparseArray = ((ComponentCallbacksC0077bw) obj31).f4606h;
                                if (sparseArray != null) {
                                    ((ComponentCallbacksC0077bw) obj31).f4586N.restoreHierarchyState(sparseArray);
                                    ((ComponentCallbacksC0077bw) obj31).f4606h = null;
                                }
                                ((ComponentCallbacksC0077bw) obj31).f4584L = false;
                                ((ComponentCallbacksC0077bw) obj31).onViewStateRestored(bundle6);
                                if (!((ComponentCallbacksC0077bw) obj31).f4584L) {
                                    throw new C0135dn("Fragment " + obj31 + " did not call through to super.onViewStateRestored()");
                                }
                                if (((ComponentCallbacksC0077bw) obj31).f4586N != null) {
                                    ((ComponentCallbacksC0077bw) obj31).f4595W.m6086a(akq.ON_CREATE);
                                }
                            }
                            ((ComponentCallbacksC0077bw) obj31).f4605g = null;
                            ((ComponentCallbacksC0077bw) obj31).f4573A.m5332n();
                            ((bck) this.f33847b).m2217q((ComponentCallbacksC0077bw) this.f33848c, bundle4, false);
                            i2 = 0;
                            z = true;
                            break;
                            break;
                        case 4:
                            if (((ComponentCallbacksC0077bw) obj10).f4586N != null && (viewGroup2 = ((ComponentCallbacksC0077bw) obj10).f4585M) != null) {
                                C0134dm c0134dmM6385b4 = C0134dm.m6385b(viewGroup2, ((ComponentCallbacksC0077bw) obj10).getParentFragmentManager());
                                int iM6522s = C0137dp.m6522s(((ComponentCallbacksC0077bw) this.f33848c).f4586N.getVisibility());
                                if (C0111cq.m5275S(2)) {
                                    StringBuilder sb19 = new StringBuilder();
                                    sb19.append("SpecialEffectsController: Enqueuing add operation for fragment ");
                                    sb19.append(this.f33848c);
                                }
                                c0134dmM6385b4.m6396k(iM6522s, 2, this);
                            }
                            ((ComponentCallbacksC0077bw) this.f33848c).f4604f = 4;
                            i2 = 0;
                            z = true;
                            break;
                        case 5:
                            if (C0111cq.m5275S(3)) {
                                StringBuilder sb20 = new StringBuilder();
                                sb20.append("moveto STARTED: ");
                                sb20.append(this.f33848c);
                            }
                            Object obj32 = this.f33848c;
                            ((ComponentCallbacksC0077bw) obj32).f4573A.m5300H();
                            ((ComponentCallbacksC0077bw) obj32).f4573A.m5317ab(true);
                            ((ComponentCallbacksC0077bw) obj32).f4604f = 5;
                            ((ComponentCallbacksC0077bw) obj32).f4584L = false;
                            ((ComponentCallbacksC0077bw) obj32).onStart();
                            if (!((ComponentCallbacksC0077bw) obj32).f4584L) {
                                throw new C0135dn("Fragment " + obj32 + " did not call through to super.onStart()");
                            }
                            ((ComponentCallbacksC0077bw) obj32).f4601ab.m880b(akq.ON_START);
                            if (((ComponentCallbacksC0077bw) obj32).f4586N != null) {
                                ((ComponentCallbacksC0077bw) obj32).f4595W.m6086a(akq.ON_START);
                            }
                            ((ComponentCallbacksC0077bw) obj32).f4573A.m5344z();
                            ((bck) this.f33847b).m2201A((ComponentCallbacksC0077bw) this.f33848c, false);
                            i2 = 0;
                            z = true;
                            break;
                            break;
                        case 6:
                            ((ComponentCallbacksC0077bw) obj10).f4604f = 6;
                            i2 = 0;
                            z = true;
                            break;
                        case 7:
                            if (C0111cq.m5275S(3)) {
                                StringBuilder sb21 = new StringBuilder();
                                sb21.append("moveto RESUMED: ");
                                sb21.append(this.f33848c);
                            }
                            Object obj33 = this.f33848c;
                            C0073bs c0073bs = ((ComponentCallbacksC0077bw) obj33).f4589Q;
                            View view3 = c0073bs == null ? null : c0073bs.f4272r;
                            if (view3 != null) {
                                if (view3 != ((ComponentCallbacksC0077bw) obj33).f4586N) {
                                    ViewParent parent = view3.getParent();
                                    while (true) {
                                        if (parent != null) {
                                            if (parent != ((ComponentCallbacksC0077bw) this.f33848c).f4586N) {
                                                parent = parent.getParent();
                                            }
                                        }
                                    }
                                }
                                boolean zRequestFocus = view3.requestFocus();
                                if (C0111cq.m5275S(2)) {
                                    StringBuilder sb22 = new StringBuilder();
                                    sb22.append("requestFocus: Restoring focused view ");
                                    sb22.append(view3);
                                    sb22.append(YmzeHXaMYOLk.eKILnK);
                                    sb22.append(true != zRequestFocus ? "failed" : "succeeded");
                                    sb22.append(KMNlNMe.buLXrHK);
                                    sb22.append(this.f33848c);
                                    sb22.append(" resulting in focused view ");
                                    sb22.append(((ComponentCallbacksC0077bw) this.f33848c).f4586N.findFocus());
                                }
                            }
                            ((ComponentCallbacksC0077bw) this.f33848c).m3123r(null);
                            Object obj34 = this.f33848c;
                            ((ComponentCallbacksC0077bw) obj34).f4573A.m5300H();
                            ((ComponentCallbacksC0077bw) obj34).f4573A.m5317ab(true);
                            ((ComponentCallbacksC0077bw) obj34).f4604f = 7;
                            ((ComponentCallbacksC0077bw) obj34).f4584L = false;
                            ((ComponentCallbacksC0077bw) obj34).onResume();
                            if (!((ComponentCallbacksC0077bw) obj34).f4584L) {
                                throw new C0135dn("Fragment " + obj34 + " did not call through to super.onResume()");
                            }
                            ((ComponentCallbacksC0077bw) obj34).f4601ab.m880b(akq.ON_RESUME);
                            if (((ComponentCallbacksC0077bw) obj34).f4586N != null) {
                                ((ComponentCallbacksC0077bw) obj34).f4595W.m6086a(akq.ON_RESUME);
                            }
                            ((ComponentCallbacksC0077bw) obj34).f4573A.m5343y();
                            ((bck) this.f33847b).m2225y((ComponentCallbacksC0077bw) this.f33848c, false);
                            Object obj35 = this.f33848c;
                            ((ComponentCallbacksC0077bw) obj35).f4605g = null;
                            ((ComponentCallbacksC0077bw) obj35).f4606h = null;
                            ((ComponentCallbacksC0077bw) obj35).f4607i = null;
                            i2 = 0;
                            z = true;
                            break;
                            break;
                        default:
                            i2 = 0;
                            z = true;
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            this.f33850e = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m13003f(ClassLoader classLoader) {
        Bundle bundle = ((ComponentCallbacksC0077bw) this.f33848c).f4605g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (((ComponentCallbacksC0077bw) this.f33848c).f4605g.getBundle("savedInstanceState") == null) {
            ((ComponentCallbacksC0077bw) this.f33848c).f4605g.putBundle("savedInstanceState", new Bundle());
        }
        ComponentCallbacksC0077bw componentCallbacksC0077bw = (ComponentCallbacksC0077bw) this.f33848c;
        componentCallbacksC0077bw.f4606h = componentCallbacksC0077bw.f4605g.getSparseParcelableArray("viewState");
        ComponentCallbacksC0077bw componentCallbacksC0077bw2 = (ComponentCallbacksC0077bw) this.f33848c;
        componentCallbacksC0077bw2.f4607i = componentCallbacksC0077bw2.f4605g.getBundle("viewRegistryState");
        C0115cu c0115cu = (C0115cu) ((ComponentCallbacksC0077bw) this.f33848c).f4605g.getParcelable("state");
        if (c0115cu != null) {
            ComponentCallbacksC0077bw componentCallbacksC0077bw3 = (ComponentCallbacksC0077bw) this.f33848c;
            componentCallbacksC0077bw3.f4612n = c0115cu.f9578l;
            componentCallbacksC0077bw3.f4613o = c0115cu.f9579m;
            Boolean bool = componentCallbacksC0077bw3.f4608j;
            if (bool != null) {
                componentCallbacksC0077bw3.f4588P = bool.booleanValue();
                ((ComponentCallbacksC0077bw) this.f33848c).f4608j = null;
            } else {
                componentCallbacksC0077bw3.f4588P = c0115cu.f9580n;
            }
        }
        ComponentCallbacksC0077bw componentCallbacksC0077bw4 = (ComponentCallbacksC0077bw) this.f33848c;
        if (componentCallbacksC0077bw4.f4588P) {
            return;
        }
        componentCallbacksC0077bw4.f4587O = true;
    }

    /* JADX INFO: renamed from: g */
    public final void m13004g() {
        if (((ComponentCallbacksC0077bw) this.f33848c).f4586N == null) {
            return;
        }
        if (C0111cq.m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Saving view state for fragment ");
            sb.append(this.f33848c);
            sb.append(" with view ");
            sb.append(((ComponentCallbacksC0077bw) this.f33848c).f4586N);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ((ComponentCallbacksC0077bw) this.f33848c).f4586N.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            ((ComponentCallbacksC0077bw) this.f33848c).f4606h = sparseArray;
        }
        Bundle bundle = new Bundle();
        ((ComponentCallbacksC0077bw) this.f33848c).f4595W.f10832b.m3226i(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        ((ComponentCallbacksC0077bw) this.f33848c).f4607i = bundle;
    }

    public jew(bck bckVar, C0116cv c0116cv, ClassLoader classLoader, C0085cd c0085cd, Bundle bundle, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f33850e = false;
        this.f33846a = -1;
        this.f33847b = bckVar;
        this.f33849d = c0116cv;
        C0115cu c0115cu = (C0115cu) bundle.getParcelable("state");
        ComponentCallbacksC0077bw componentCallbacksC0077bwMo3476b = c0085cd.mo3476b(c0115cu.f9567a);
        componentCallbacksC0077bwMo3476b.f4609k = c0115cu.f9568b;
        componentCallbacksC0077bwMo3476b.f4618t = c0115cu.f9569c;
        componentCallbacksC0077bwMo3476b.f4620v = true;
        componentCallbacksC0077bwMo3476b.f4575C = c0115cu.f9570d;
        componentCallbacksC0077bwMo3476b.f4576D = c0115cu.f9571e;
        componentCallbacksC0077bwMo3476b.f4577E = c0115cu.f9572f;
        componentCallbacksC0077bwMo3476b.f4580H = c0115cu.f9573g;
        componentCallbacksC0077bwMo3476b.f4616r = c0115cu.f9574h;
        componentCallbacksC0077bwMo3476b.f4579G = c0115cu.f9575i;
        componentCallbacksC0077bwMo3476b.f4578F = c0115cu.f9576j;
        componentCallbacksC0077bwMo3476b.f4594V = akr.values()[c0115cu.f9577k];
        componentCallbacksC0077bwMo3476b.f4612n = c0115cu.f9578l;
        componentCallbacksC0077bwMo3476b.f4613o = c0115cu.f9579m;
        componentCallbacksC0077bwMo3476b.f4588P = c0115cu.f9580n;
        this.f33848c = componentCallbacksC0077bwMo3476b;
        componentCallbacksC0077bwMo3476b.f4605g = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        componentCallbacksC0077bwMo3476b.setArguments(bundle2);
        if (C0111cq.m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(componentCallbacksC0077bwMo3476b);
        }
    }

    public jew(Iterable iterable) {
        this.f33848c = new C1109wy();
        this.f33849d = new khb((byte[]) null, (byte[]) null);
        this.f33850e = false;
        this.f33847b = new C1109wy();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            jed jedVar = (jed) it.next();
            ((C1117xf) this.f33847b).put(jedVar.mo12958c(), null);
        }
        this.f33846a = ((C1109wy) this.f33847b).keySet().size();
    }
}

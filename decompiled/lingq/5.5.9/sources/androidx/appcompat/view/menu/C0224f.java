package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p254m2.C7472a;
import p353r2.InterfaceMenuC8724a;
import p471x2.AbstractC10028b;
import p471x2.C10035e0;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.f */
/* JADX INFO: loaded from: classes.dex */
public class C0224f implements InterfaceMenuC8724a {

    /* JADX INFO: renamed from: y */
    public static final int[] f692y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    public final Context f693a;

    /* JADX INFO: renamed from: b */
    public final Resources f694b;

    /* JADX INFO: renamed from: c */
    public boolean f695c;

    /* JADX INFO: renamed from: d */
    public boolean f696d;

    /* JADX INFO: renamed from: e */
    public a f697e;

    /* JADX INFO: renamed from: f */
    public final ArrayList<C0226h> f698f;

    /* JADX INFO: renamed from: g */
    public final ArrayList<C0226h> f699g;

    /* JADX INFO: renamed from: h */
    public boolean f700h;

    /* JADX INFO: renamed from: i */
    public final ArrayList<C0226h> f701i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<C0226h> f702j;

    /* JADX INFO: renamed from: k */
    public boolean f703k;

    /* JADX INFO: renamed from: m */
    public CharSequence f705m;

    /* JADX INFO: renamed from: n */
    public Drawable f706n;

    /* JADX INFO: renamed from: o */
    public View f707o;

    /* JADX INFO: renamed from: v */
    public C0226h f714v;

    /* JADX INFO: renamed from: x */
    public boolean f716x;

    /* JADX INFO: renamed from: l */
    public int f704l = 0;

    /* JADX INFO: renamed from: p */
    public boolean f708p = false;

    /* JADX INFO: renamed from: q */
    public boolean f709q = false;

    /* JADX INFO: renamed from: r */
    public boolean f710r = false;

    /* JADX INFO: renamed from: s */
    public boolean f711s = false;

    /* JADX INFO: renamed from: t */
    public final ArrayList<C0226h> f712t = new ArrayList<>();

    /* JADX INFO: renamed from: u */
    public final CopyOnWriteArrayList<WeakReference<InterfaceC0228j>> f713u = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: w */
    public boolean f715w = false;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.f$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo940a(C0224f c0224f, MenuItem menuItem);

        /* JADX INFO: renamed from: b */
        void mo941b(C0224f c0224f);
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.f$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo889a(C0226h c0226h);
    }

    public C0224f(Context context) {
        boolean zM18796b;
        boolean z10 = false;
        this.f693a = context;
        Resources resources = context.getResources();
        this.f694b = resources;
        this.f698f = new ArrayList<>();
        this.f699g = new ArrayList<>();
        this.f700h = true;
        this.f701i = new ArrayList<>();
        this.f702j = new ArrayList<>();
        this.f703k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zM18796b = C10035e0.m18796b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zM18796b = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zM18796b) {
                z10 = true;
            }
        }
        this.f696d = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public C0226h mo235a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f692y[i14] << 16) | (65535 & i12);
        C0226h c0226h = new C0226h(this, i10, i11, i12, i15, charSequence, this.f704l);
        ArrayList<C0226h> arrayList = this.f698f;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                i13 = 0;
            }
            arrayList.add(i13, c0226h);
            m932p(true);
            return c0226h;
        } while (arrayList.get(size).f726d > i15);
        i13 = size + 1;
        arrayList.add(i13, c0226h);
        m932p(true);
        return c0226h;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return mo235a(0, 0, 0, this.f694b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return mo235a(i10, i11, i12, this.f694b.getString(i13));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return mo235a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return mo235a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f693a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C0226h c0226hMo235a = mo235a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            c0226hMo235a.setIcon(resolveInfo.loadIcon(packageManager));
            c0226hMo235a.f729g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = c0226hMo235a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f694b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f694b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        C0226h c0226hMo235a = mo235a(i10, i11, i12, charSequence);
        SubMenuC0231m subMenuC0231m = new SubMenuC0231m(this.f693a, this, c0226hMo235a);
        c0226hMo235a.f737o = subMenuC0231m;
        subMenuC0231m.setHeaderTitle(c0226hMo235a.f727e);
        return subMenuC0231m;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public final void m918b(InterfaceC0228j interfaceC0228j, Context context) {
        this.f713u.add(new WeakReference<>(interfaceC0228j));
        interfaceC0228j.mo913h(context, this);
        this.f703k = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m919c(boolean z10) {
        if (this.f711s) {
            return;
        }
        this.f711s = true;
        CopyOnWriteArrayList<WeakReference<InterfaceC0228j>> copyOnWriteArrayList = this.f713u;
        for (WeakReference<InterfaceC0228j> weakReference : copyOnWriteArrayList) {
            InterfaceC0228j interfaceC0228j = weakReference.get();
            if (interfaceC0228j == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0228j.mo895c(this, z10);
            }
        }
        this.f711s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0226h c0226h = this.f714v;
        if (c0226h != null) {
            mo920d(c0226h);
        }
        this.f698f.clear();
        m932p(true);
    }

    public final void clearHeader() {
        this.f706n = null;
        this.f705m = null;
        this.f707o = null;
        m932p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m919c(true);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo920d(C0226h c0226h) {
        CopyOnWriteArrayList<WeakReference<InterfaceC0228j>> copyOnWriteArrayList = this.f713u;
        boolean zMo891g = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f714v == c0226h) {
            m939w();
            for (WeakReference<InterfaceC0228j> weakReference : copyOnWriteArrayList) {
                InterfaceC0228j interfaceC0228j = weakReference.get();
                if (interfaceC0228j != null) {
                    zMo891g = interfaceC0228j.mo891g(c0226h);
                    if (zMo891g) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m938v();
            if (zMo891g) {
                this.f714v = null;
            }
        }
        return zMo891g;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo921e(C0224f c0224f, MenuItem menuItem) {
        a aVar = this.f697e;
        return aVar != null && aVar.mo940a(c0224f, menuItem);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo922f(C0226h c0226h) {
        InterfaceC0228j interfaceC0228j;
        CopyOnWriteArrayList<WeakReference<InterfaceC0228j>> copyOnWriteArrayList = this.f713u;
        boolean zMo892m = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m939w();
        Iterator<WeakReference<InterfaceC0228j>> it = copyOnWriteArrayList.iterator();
        loop0: do {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                WeakReference<InterfaceC0228j> next = it.next();
                interfaceC0228j = next.get();
                if (interfaceC0228j == null) {
                    copyOnWriteArrayList.remove(next);
                }
            }
            zMo892m = interfaceC0228j.mo892m(c0226h);
        } while (!zMo892m);
        m938v();
        if (zMo892m) {
            this.f714v = c0226h;
        }
        return zMo892m;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            C0226h c0226h = this.f698f.get(i11);
            if (c0226h.f723a == i10) {
                return c0226h;
            }
            if (c0226h.hasSubMenu() && (menuItemFindItem = c0226h.f737o.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final C0226h m923g(int i10, KeyEvent keyEvent) {
        ArrayList<C0226h> arrayList = this.f712t;
        arrayList.clear();
        m924h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zMo930n = mo930n();
        for (int i11 = 0; i11 < size; i11++) {
            C0226h c0226h = arrayList.get(i11);
            char c10 = zMo930n ? c0226h.f732j : c0226h.f730h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (zMo930n && c10 == '\b' && i10 == 67))) {
                return c0226h;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return this.f698f.get(i10);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX INFO: renamed from: h */
    public final void m924h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        boolean zMo930n = mo930n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList<C0226h> arrayList2 = this.f698f;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0226h c0226h = arrayList2.get(i11);
                if (c0226h.hasSubMenu()) {
                    c0226h.f737o.m924h(arrayList, i10, keyEvent);
                }
                char c10 = zMo930n ? c0226h.f732j : c0226h.f730h;
                if (((modifiers & 69647) == ((zMo930n ? c0226h.f733k : c0226h.f731i) & 69647)) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if (c10 != cArr[0] && c10 != cArr[2]) {
                        if (zMo930n && c10 == '\b') {
                            if (i10 == 67) {
                            }
                        }
                    }
                    if (c0226h.isEnabled()) {
                        arrayList.add(c0226h);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f716x) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f698f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m925i() {
        ArrayList<C0226h> arrayListM928l = m928l();
        if (this.f703k) {
            CopyOnWriteArrayList<WeakReference<InterfaceC0228j>> copyOnWriteArrayList = this.f713u;
            boolean zMo897e = false;
            for (WeakReference<InterfaceC0228j> weakReference : copyOnWriteArrayList) {
                InterfaceC0228j interfaceC0228j = weakReference.get();
                if (interfaceC0228j == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo897e |= interfaceC0228j.mo897e();
                }
            }
            ArrayList<C0226h> arrayList = this.f701i;
            ArrayList<C0226h> arrayList2 = this.f702j;
            if (zMo897e) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM928l.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C0226h c0226h = arrayListM928l.get(i10);
                    if ((c0226h.f746x & 32) == 32) {
                        arrayList.add(c0226h);
                    } else {
                        arrayList2.add(c0226h);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m928l());
            }
            this.f703k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return m923g(i10, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public String mo926j() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: k */
    public C0224f mo927k() {
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList<C0226h> m928l() {
        boolean z10 = this.f700h;
        ArrayList<C0226h> arrayList = this.f699g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<C0226h> arrayList2 = this.f698f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0226h c0226h = arrayList2.get(i10);
            if (c0226h.isVisible()) {
                arrayList.add(c0226h);
            }
        }
        this.f700h = false;
        this.f703k = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo929m() {
        return this.f715w;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo930n() {
        return this.f695c;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo931o() {
        return this.f696d;
    }

    /* JADX INFO: renamed from: p */
    public final void m932p(boolean z10) {
        if (this.f708p) {
            this.f709q = true;
            if (z10) {
                this.f710r = true;
            }
            return;
        }
        if (z10) {
            this.f700h = true;
            this.f703k = true;
        }
        CopyOnWriteArrayList<WeakReference<InterfaceC0228j>> copyOnWriteArrayList = this.f713u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m939w();
        for (WeakReference<InterfaceC0228j> weakReference : copyOnWriteArrayList) {
            InterfaceC0228j interfaceC0228j = weakReference.get();
            if (interfaceC0228j == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC0228j.mo896d(z10);
            }
        }
        m938v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return m933q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        C0226h c0226hM923g = m923g(i10, keyEvent);
        boolean zM933q = c0226hM923g != null ? m933q(c0226hM923g, null, i11) : false;
        if ((i11 & 2) != 0) {
            m919c(true);
        }
        return zM933q;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f5 A[PHI: r1
      0x00f5: PHI (r1v10 boolean) = (r1v9 boolean), (r1v9 boolean), (r1v8 boolean), (r1v12 boolean) binds: [B:73:0x00f0, B:74:0x00f2, B:46:0x0084, B:38:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00cb A[SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    public final boolean m933q(MenuItem menuItem, InterfaceC0228j interfaceC0228j, int i10) {
        AbstractC10028b abstractC10028b;
        boolean zExpandActionView;
        AbstractC10028b abstractC10028b2;
        boolean z10;
        SubMenuC0231m subMenuC0231m;
        CopyOnWriteArrayList<WeakReference<InterfaceC0228j>> copyOnWriteArrayList;
        InterfaceC0228j interfaceC0228j2;
        C0226h c0226h = (C0226h) menuItem;
        boolean zMo900k = false;
        if (c0226h == null || !c0226h.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c0226h.f738p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c0226h)) {
            C0224f c0224f = c0226h.f736n;
            if (!c0224f.mo921e(c0224f, c0226h)) {
                Intent intent = c0226h.f729g;
                if (intent != null) {
                    try {
                        c0224f.f693a.startActivity(intent);
                    } catch (ActivityNotFoundException e10) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                        abstractC10028b = c0226h.f720A;
                        if (abstractC10028b != null) {
                        }
                        zExpandActionView = false;
                        abstractC10028b2 = c0226h.f720A;
                        if (abstractC10028b2 == null) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (c0226h.m948e()) {
                            zExpandActionView |= c0226h.expandActionView();
                            if (zExpandActionView) {
                                m919c(true);
                            }
                        } else if (c0226h.hasSubMenu()) {
                            if ((i10 & 4) == 0) {
                                m919c(false);
                            }
                            if (!c0226h.hasSubMenu()) {
                                SubMenuC0231m subMenuC0231m2 = new SubMenuC0231m(this.f693a, this, c0226h);
                                c0226h.f737o = subMenuC0231m2;
                                subMenuC0231m2.setHeaderTitle(c0226h.f727e);
                            }
                            subMenuC0231m = c0226h.f737o;
                            if (z10) {
                                abstractC10028b2.mo13020f(subMenuC0231m);
                            }
                            copyOnWriteArrayList = this.f713u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                zMo900k = interfaceC0228j != null ? interfaceC0228j.mo900k(subMenuC0231m) : false;
                                for (WeakReference<InterfaceC0228j> weakReference : copyOnWriteArrayList) {
                                    interfaceC0228j2 = weakReference.get();
                                    if (interfaceC0228j2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zMo900k) {
                                        zMo900k = interfaceC0228j2.mo900k(subMenuC0231m);
                                    }
                                }
                            }
                            zExpandActionView |= zMo900k;
                            if (!zExpandActionView) {
                                m919c(true);
                            }
                        } else {
                            if ((i10 & 4) == 0) {
                                m919c(false);
                            }
                            if (!c0226h.hasSubMenu()) {
                                SubMenuC0231m subMenuC0231m3 = new SubMenuC0231m(this.f693a, this, c0226h);
                                c0226h.f737o = subMenuC0231m3;
                                subMenuC0231m3.setHeaderTitle(c0226h.f727e);
                            }
                            subMenuC0231m = c0226h.f737o;
                            if (z10) {
                                abstractC10028b2.mo13020f(subMenuC0231m);
                            }
                            copyOnWriteArrayList = this.f713u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                if (interfaceC0228j != null) {
                                }
                                while (r6.hasNext()) {
                                    interfaceC0228j2 = weakReference.get();
                                    if (interfaceC0228j2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zMo900k) {
                                        zMo900k = interfaceC0228j2.mo900k(subMenuC0231m);
                                    }
                                }
                            }
                            zExpandActionView |= zMo900k;
                            if (!zExpandActionView) {
                                m919c(true);
                            }
                        }
                        return zExpandActionView;
                    }
                } else {
                    abstractC10028b = c0226h.f720A;
                    if (abstractC10028b != null || !abstractC10028b.mo13019e()) {
                        zExpandActionView = false;
                    }
                }
            }
            abstractC10028b2 = c0226h.f720A;
            if (abstractC10028b2 == null && abstractC10028b2.mo13017a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0226h.m948e()) {
                zExpandActionView |= c0226h.expandActionView();
                if (zExpandActionView) {
                    m919c(true);
                }
            } else if (c0226h.hasSubMenu() || z10) {
                if ((i10 & 4) == 0) {
                    m919c(false);
                }
                if (!c0226h.hasSubMenu()) {
                    SubMenuC0231m subMenuC0231m4 = new SubMenuC0231m(this.f693a, this, c0226h);
                    c0226h.f737o = subMenuC0231m4;
                    subMenuC0231m4.setHeaderTitle(c0226h.f727e);
                }
                subMenuC0231m = c0226h.f737o;
                if (z10) {
                    abstractC10028b2.mo13020f(subMenuC0231m);
                }
                copyOnWriteArrayList = this.f713u;
                if (!copyOnWriteArrayList.isEmpty()) {
                    if (interfaceC0228j != null) {
                    }
                    while (r6.hasNext()) {
                        interfaceC0228j2 = weakReference.get();
                        if (interfaceC0228j2 == null) {
                            copyOnWriteArrayList.remove(weakReference);
                        } else if (!zMo900k) {
                            zMo900k = interfaceC0228j2.mo900k(subMenuC0231m);
                        }
                    }
                }
                zExpandActionView |= zMo900k;
                if (!zExpandActionView) {
                    m919c(true);
                }
            } else if ((i10 & 1) == 0) {
                m919c(true);
            }
            return zExpandActionView;
        }
        zExpandActionView = true;
        abstractC10028b2 = c0226h.f720A;
        if (abstractC10028b2 == null) {
            z10 = false;
        } else {
            z10 = false;
        }
        if (c0226h.m948e()) {
            zExpandActionView |= c0226h.expandActionView();
            if (zExpandActionView) {
                m919c(true);
            }
        } else if (c0226h.hasSubMenu()) {
            if ((i10 & 4) == 0) {
                m919c(false);
            }
            if (!c0226h.hasSubMenu()) {
                SubMenuC0231m subMenuC0231m5 = new SubMenuC0231m(this.f693a, this, c0226h);
                c0226h.f737o = subMenuC0231m5;
                subMenuC0231m5.setHeaderTitle(c0226h.f727e);
            }
            subMenuC0231m = c0226h.f737o;
            if (z10) {
                abstractC10028b2.mo13020f(subMenuC0231m);
            }
            copyOnWriteArrayList = this.f713u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (interfaceC0228j != null) {
                }
                while (r6.hasNext()) {
                    interfaceC0228j2 = weakReference.get();
                    if (interfaceC0228j2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo900k) {
                        zMo900k = interfaceC0228j2.mo900k(subMenuC0231m);
                    }
                }
            }
            zExpandActionView |= zMo900k;
            if (!zExpandActionView) {
                m919c(true);
            }
        } else {
            if ((i10 & 4) == 0) {
                m919c(false);
            }
            if (!c0226h.hasSubMenu()) {
                SubMenuC0231m subMenuC0231m6 = new SubMenuC0231m(this.f693a, this, c0226h);
                c0226h.f737o = subMenuC0231m6;
                subMenuC0231m6.setHeaderTitle(c0226h.f727e);
            }
            subMenuC0231m = c0226h.f737o;
            if (z10) {
                abstractC10028b2.mo13020f(subMenuC0231m);
            }
            copyOnWriteArrayList = this.f713u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (interfaceC0228j != null) {
                }
                while (r6.hasNext()) {
                    interfaceC0228j2 = weakReference.get();
                    if (interfaceC0228j2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo900k) {
                        zMo900k = interfaceC0228j2.mo900k(subMenuC0231m);
                    }
                }
            }
            zExpandActionView |= zMo900k;
            if (!zExpandActionView) {
                m919c(true);
            }
        }
        return zExpandActionView;
    }

    /* JADX INFO: renamed from: r */
    public final void m934r(InterfaceC0228j interfaceC0228j) {
        CopyOnWriteArrayList<WeakReference<InterfaceC0228j>> copyOnWriteArrayList = this.f713u;
        for (WeakReference<InterfaceC0228j> weakReference : copyOnWriteArrayList) {
            InterfaceC0228j interfaceC0228j2 = weakReference.get();
            if (interfaceC0228j2 == null || interfaceC0228j2 == interfaceC0228j) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList<C0226h> arrayList;
        int size = size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            arrayList = this.f698f;
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (arrayList.get(i12).f724b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || arrayList.get(i12).f724b != i10) {
                    break;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    arrayList.remove(i12);
                }
                i11 = i13;
            }
            m932p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList<C0226h> arrayList;
        int size = size();
        int i11 = 0;
        while (true) {
            arrayList = this.f698f;
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (arrayList.get(i11).f723a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i11);
        m932p(true);
    }

    /* JADX INFO: renamed from: s */
    public final void m935s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo926j());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0231m) item.getSubMenu()).m935s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ArrayList<C0226h> arrayList = this.f698f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0226h c0226h = arrayList.get(i11);
            if (c0226h.f724b == i10) {
                c0226h.f746x = (c0226h.f746x & (-5)) | (z11 ? 4 : 0);
                c0226h.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f715w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList<C0226h> arrayList = this.f698f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0226h c0226h = arrayList.get(i11);
            if (c0226h.f724b == i10) {
                c0226h.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        ArrayList<C0226h> arrayList = this.f698f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C0226h c0226h = arrayList.get(i11);
            if (c0226h.f724b == i10) {
                int i12 = c0226h.f746x;
                int i13 = (i12 & (-9)) | (z10 ? 0 : 8);
                c0226h.f746x = i13;
                if (i12 != i13) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            m932p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f695c = z10;
        m932p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f698f.size();
    }

    /* JADX INFO: renamed from: t */
    public final void m936t(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0231m) item.getSubMenu()).m936t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo926j(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m937u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f707o = view;
            this.f705m = null;
            this.f706n = null;
        } else {
            if (i10 > 0) {
                this.f705m = this.f694b.getText(i10);
            } else if (charSequence != null) {
                this.f705m = charSequence;
            }
            if (i11 > 0) {
                Object obj = C7472a.f41322a;
                this.f706n = C7472a.c.m14849b(this.f693a, i11);
            } else if (drawable != null) {
                this.f706n = drawable;
            }
            this.f707o = null;
        }
        m932p(false);
    }

    /* JADX INFO: renamed from: v */
    public final void m938v() {
        this.f708p = false;
        if (this.f709q) {
            this.f709q = false;
            m932p(this.f710r);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m939w() {
        if (!this.f708p) {
            this.f708p = true;
            this.f709q = false;
            this.f710r = false;
        }
    }
}

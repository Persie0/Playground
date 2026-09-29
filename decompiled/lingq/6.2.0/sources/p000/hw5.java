package p000;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class hw5 implements Menu {

    /* JADX INFO: renamed from: y */
    public static final int[] f43036y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a */
    public final Context f43037a;

    /* JADX INFO: renamed from: b */
    public final Resources f43038b;

    /* JADX INFO: renamed from: c */
    public boolean f43039c;

    /* JADX INFO: renamed from: d */
    public final boolean f43040d;

    /* JADX INFO: renamed from: e */
    public fw5 f43041e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f43042f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f43043g;

    /* JADX INFO: renamed from: h */
    public boolean f43044h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f43045i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f43046j;

    /* JADX INFO: renamed from: k */
    public boolean f43047k;

    /* JADX INFO: renamed from: m */
    public CharSequence f43049m;

    /* JADX INFO: renamed from: n */
    public Drawable f43050n;

    /* JADX INFO: renamed from: o */
    public View f43051o;

    /* JADX INFO: renamed from: v */
    public mw5 f43058v;

    /* JADX INFO: renamed from: x */
    public boolean f43060x;

    /* JADX INFO: renamed from: l */
    public int f43048l = 0;

    /* JADX INFO: renamed from: p */
    public boolean f43052p = false;

    /* JADX INFO: renamed from: q */
    public boolean f43053q = false;

    /* JADX INFO: renamed from: r */
    public boolean f43054r = false;

    /* JADX INFO: renamed from: s */
    public boolean f43055s = false;

    /* JADX INFO: renamed from: t */
    public final ArrayList f43056t = new ArrayList();

    /* JADX INFO: renamed from: u */
    public final CopyOnWriteArrayList f43057u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w */
    public boolean f43059w = false;

    public hw5(Context context) {
        boolean z = false;
        this.f43037a = context;
        Resources resources = context.getResources();
        this.f43038b = resources;
        this.f43042f = new ArrayList();
        this.f43043g = new ArrayList();
        this.f43044h = true;
        this.f43045i = new ArrayList();
        this.f43046j = new ArrayList();
        this.f43047k = true;
        if (resources.getConfiguration().keyboard != 1 && sad.m21191d(ViewConfiguration.get(context))) {
            z = true;
        }
        this.f43040d = z;
    }

    /* JADX INFO: renamed from: a */
    public mw5 mo13518a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            C3386nv.m17626m("order does not contain a valid category.");
            return null;
        }
        int i6 = (f43036y[i5] << 16) | (65535 & i3);
        mw5 mw5Var = new mw5(this, i, i2, i3, i6, charSequence, this.f43048l);
        ArrayList arrayList = this.f43042f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((mw5) arrayList.get(size)).f51945d <= i6) {
                i4 = size + 1;
                arrayList.add(i4, mw5Var);
                m13533p(true);
                return mw5Var;
            }
        }
        i4 = 0;
        arrayList.add(i4, mw5Var);
        m13533p(true);
        return mw5Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return mo13518a(0, 0, 0, this.f43038b.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f43037a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            mw5 mw5VarMo13518a = mo13518a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            mw5VarMo13518a.setIcon(resolveInfo.loadIcon(packageManager));
            mw5VarMo13518a.f51948g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = mw5VarMo13518a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        mw5 mw5VarMo13518a = mo13518a(i, i2, i3, charSequence);
        om9 om9Var = new om9(this.f43037a, this, mw5VarMo13518a);
        mw5VarMo13518a.f51956o = om9Var;
        om9Var.setHeaderTitle(mw5VarMo13518a.f51946e);
        return om9Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m13519b(ex5 ex5Var, Context context) {
        this.f43057u.add(new WeakReference(ex5Var));
        ex5Var.mo712l(context, this);
        this.f43047k = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m13520c(boolean z) {
        if (this.f43055s) {
            return;
        }
        this.f43055s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f43057u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            ex5 ex5Var = (ex5) weakReference.get();
            if (ex5Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                ex5Var.mo702b(this, z);
            }
        }
        this.f43055s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        mw5 mw5Var = this.f43058v;
        if (mw5Var != null) {
            mo13521d(mw5Var);
        }
        this.f43042f.clear();
        m13533p(true);
    }

    public final void clearHeader() {
        this.f43050n = null;
        this.f43049m = null;
        this.f43051o = null;
        m13533p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m13520c(true);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo13521d(mw5 mw5Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f43057u;
        boolean zMo707g = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f43058v == mw5Var) {
            m13540w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                ex5 ex5Var = (ex5) weakReference.get();
                if (ex5Var != null) {
                    zMo707g = ex5Var.mo707g(mw5Var);
                    if (zMo707g) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m13539v();
            if (zMo707g) {
                this.f43058v = null;
            }
        }
        return zMo707g;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo13522e(hw5 hw5Var, MenuItem menuItem) {
        fw5 fw5Var = this.f43041e;
        return fw5Var != null && fw5Var.mo12237e(hw5Var, menuItem);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo13523f(mw5 mw5Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f43057u;
        boolean zMo710j = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m13540w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            ex5 ex5Var = (ex5) weakReference.get();
            if (ex5Var != null) {
                zMo710j = ex5Var.mo710j(mw5Var);
                if (zMo710j) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m13539v();
        if (zMo710j) {
            this.f43058v = mw5Var;
        }
        return zMo710j;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f43042f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            mw5 mw5Var = (mw5) arrayList.get(i2);
            if (mw5Var.f51942a == i) {
                return mw5Var;
            }
            if (mw5Var.hasSubMenu() && (menuItemFindItem = mw5Var.f51956o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final mw5 m13524g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f43056t;
        arrayList.clear();
        m13525h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (mw5) arrayList.get(0);
        }
        boolean zMo13531n = mo13531n();
        for (int i2 = 0; i2 < size; i2++) {
            mw5 mw5Var = (mw5) arrayList.get(i2);
            char c = zMo13531n ? mw5Var.f51951j : mw5Var.f51949h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zMo13531n && c == '\b' && i == 67))) {
                return mw5Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f43042f.get(i);
    }

    /* JADX INFO: renamed from: h */
    public final void m13525h(List list, int i, KeyEvent keyEvent) {
        boolean zMo13531n = mo13531n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f43042f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                mw5 mw5Var = (mw5) arrayList.get(i2);
                if (mw5Var.hasSubMenu()) {
                    mw5Var.f51956o.m13525h(list, i, keyEvent);
                }
                char c = zMo13531n ? mw5Var.f51951j : mw5Var.f51949h;
                if ((modifiers & 69647) == ((zMo13531n ? mw5Var.f51952k : mw5Var.f51950i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zMo13531n && c == '\b' && i == 67)) && mw5Var.isEnabled()) {
                        list.add(mw5Var);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f43060x) {
            return true;
        }
        ArrayList arrayList = this.f43042f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((mw5) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m13526i() {
        ArrayList arrayListM13529l = m13529l();
        if (this.f43047k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f43057u;
            boolean zMo705e = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                ex5 ex5Var = (ex5) weakReference.get();
                if (ex5Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo705e |= ex5Var.mo705e();
                }
            }
            ArrayList arrayList = this.f43045i;
            ArrayList arrayList2 = this.f43046j;
            if (zMo705e) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM13529l.size();
                for (int i = 0; i < size; i++) {
                    mw5 mw5Var = (mw5) arrayListM13529l.get(i);
                    if ((mw5Var.f51965x & 32) == 32) {
                        arrayList.add(mw5Var);
                    } else {
                        arrayList2.add(mw5Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m13529l());
            }
            this.f43047k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m13524g(i, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public String mo13527j() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: k */
    public hw5 mo13528k() {
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final ArrayList m13529l() {
        boolean z = this.f43044h;
        ArrayList arrayList = this.f43043g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f43042f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            mw5 mw5Var = (mw5) arrayList2.get(i);
            if (mw5Var.isVisible()) {
                arrayList.add(mw5Var);
            }
        }
        this.f43044h = false;
        this.f43047k = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo13530m() {
        return this.f43059w;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo13531n() {
        return this.f43039c;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo13532o() {
        return this.f43040d;
    }

    /* JADX INFO: renamed from: p */
    public void m13533p(boolean z) {
        if (this.f43052p) {
            this.f43053q = true;
            if (z) {
                this.f43054r = true;
                return;
            }
            return;
        }
        if (z) {
            this.f43044h = true;
            this.f43047k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f43057u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m13540w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            ex5 ex5Var = (ex5) weakReference.get();
            if (ex5Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                ex5Var.mo703c(z);
            }
        }
        m13539v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return m13534q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        mw5 mw5VarM13524g = m13524g(i, keyEvent);
        boolean zM13534q = mw5VarM13524g != null ? m13534q(mw5VarM13524g, null, i2) : false;
        if ((i2 & 2) != 0) {
            m13520c(true);
        }
        return zM13534q;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0075  */
    /* JADX WARN: Code duplicated, block: B:50:0x007e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    public final boolean m13534q(MenuItem menuItem, ex5 ex5Var, int i) {
        nw5 nw5Var;
        boolean zExpandActionView;
        nw5 nw5Var2;
        boolean z;
        om9 om9Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        ex5 ex5Var2;
        mw5 mw5Var = (mw5) menuItem;
        boolean zMo704d = false;
        if (mw5Var == null || !mw5Var.isEnabled()) {
            return false;
        }
        hw5 hw5Var = mw5Var.f51955n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = mw5Var.f51957p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(mw5Var)) && !hw5Var.mo13522e(hw5Var, mw5Var)) {
            Intent intent = mw5Var.f51948g;
            if (intent != null) {
                try {
                    hw5Var.f43037a.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    nw5Var = mw5Var.f51939A;
                    if (nw5Var == null) {
                    }
                    zExpandActionView = false;
                    nw5Var2 = mw5Var.f51939A;
                    if (nw5Var2 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (mw5Var.m17077e()) {
                        zExpandActionView |= mw5Var.expandActionView();
                        if (zExpandActionView) {
                            m13520c(true);
                        }
                    } else if (mw5Var.hasSubMenu()) {
                        if ((i & 4) == 0) {
                            m13520c(false);
                        }
                        if (!mw5Var.hasSubMenu()) {
                            om9 om9Var2 = new om9(this.f43037a, this, mw5Var);
                            mw5Var.f51956o = om9Var2;
                            om9Var2.setHeaderTitle(mw5Var.f51946e);
                        }
                        om9Var = mw5Var.f51956o;
                        if (z) {
                            nw5Var2.m17660e(om9Var);
                        }
                        copyOnWriteArrayList = this.f43057u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (ex5Var != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                ex5Var2 = (ex5) weakReference.get();
                                if (ex5Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zMo704d) {
                                    zMo704d = ex5Var2.mo704d(om9Var);
                                }
                            }
                        }
                        zExpandActionView |= zMo704d;
                        if (!zExpandActionView) {
                            m13520c(true);
                        }
                    } else {
                        if ((i & 4) == 0) {
                            m13520c(false);
                        }
                        if (!mw5Var.hasSubMenu()) {
                            om9 om9Var3 = new om9(this.f43037a, this, mw5Var);
                            mw5Var.f51956o = om9Var3;
                            om9Var3.setHeaderTitle(mw5Var.f51946e);
                        }
                        om9Var = mw5Var.f51956o;
                        if (z) {
                            nw5Var2.m17660e(om9Var);
                        }
                        copyOnWriteArrayList = this.f43057u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zMo704d = ex5Var != null ? ex5Var.mo704d(om9Var) : false;
                            while (r8.hasNext()) {
                                ex5Var2 = (ex5) weakReference.get();
                                if (ex5Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zMo704d) {
                                    zMo704d = ex5Var2.mo704d(om9Var);
                                }
                            }
                        }
                        zExpandActionView |= zMo704d;
                        if (!zExpandActionView) {
                            m13520c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                nw5Var = mw5Var.f51939A;
                if (nw5Var == null && nw5Var.m17659d()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        nw5Var2 = mw5Var.f51939A;
        if (nw5Var2 == null && nw5Var2.m17656a()) {
            z = true;
        } else {
            z = false;
        }
        if (mw5Var.m17077e()) {
            zExpandActionView |= mw5Var.expandActionView();
            if (zExpandActionView) {
                m13520c(true);
            }
        } else if (mw5Var.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m13520c(false);
            }
            if (!mw5Var.hasSubMenu()) {
                om9 om9Var4 = new om9(this.f43037a, this, mw5Var);
                mw5Var.f51956o = om9Var4;
                om9Var4.setHeaderTitle(mw5Var.f51946e);
            }
            om9Var = mw5Var.f51956o;
            if (z) {
                nw5Var2.m17660e(om9Var);
            }
            copyOnWriteArrayList = this.f43057u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (ex5Var != null) {
                }
                while (r8.hasNext()) {
                    ex5Var2 = (ex5) weakReference.get();
                    if (ex5Var2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo704d) {
                        zMo704d = ex5Var2.mo704d(om9Var);
                    }
                }
            }
            zExpandActionView |= zMo704d;
            if (!zExpandActionView) {
                m13520c(true);
            }
        } else if ((i & 1) == 0) {
            m13520c(true);
        }
        return zExpandActionView;
    }

    /* JADX INFO: renamed from: r */
    public final void m13535r(ex5 ex5Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f43057u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            ex5 ex5Var2 = (ex5) weakReference.get();
            if (ex5Var2 == null || ex5Var2 == ex5Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f43042f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((mw5) arrayList.get(i3)).f51943b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((mw5) arrayList.get(i3)).f51943b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            m13533p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f43042f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((mw5) arrayList.get(i2)).f51942a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        m13533p(true);
    }

    /* JADX INFO: renamed from: s */
    public final void m13536s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo13527j());
        int size = this.f43042f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((om9) item.getSubMenu()).m13536s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f43042f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            mw5 mw5Var = (mw5) arrayList.get(i2);
            if (mw5Var.f51943b == i) {
                mw5Var.f51965x = (mw5Var.f51965x & (-5)) | (z2 ? 4 : 0);
                mw5Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f43059w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f43042f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            mw5 mw5Var = (mw5) arrayList.get(i2);
            if (mw5Var.f51943b == i) {
                mw5Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f43042f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            mw5 mw5Var = (mw5) arrayList.get(i2);
            if (mw5Var.f51943b == i) {
                int i3 = mw5Var.f51965x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                mw5Var.f51965x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m13533p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f43039c = z;
        m13533p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f43042f.size();
    }

    /* JADX INFO: renamed from: t */
    public final void m13537t(Bundle bundle) {
        int size = this.f43042f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
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
                ((om9) item.getSubMenu()).m13537t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo13527j(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m13538u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f43051o = view;
            this.f43049m = null;
            this.f43050n = null;
        } else {
            if (i > 0) {
                this.f43049m = this.f43038b.getText(i);
            } else if (charSequence != null) {
                this.f43049m = charSequence;
            }
            if (i2 > 0) {
                this.f43050n = this.f43037a.getDrawable(i2);
            } else if (drawable != null) {
                this.f43050n = drawable;
            }
            this.f43051o = null;
        }
        m13533p(false);
    }

    /* JADX INFO: renamed from: v */
    public final void m13539v() {
        this.f43052p = false;
        if (this.f43053q) {
            this.f43053q = false;
            m13533p(this.f43054r);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m13540w() {
        if (this.f43052p) {
            return;
        }
        this.f43052p = true;
        this.f43053q = false;
        this.f43054r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return mo13518a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo13518a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return mo13518a(i, i2, i3, this.f43038b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f43038b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f43038b.getString(i4));
    }
}
